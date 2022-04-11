import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;

public class Game extends Canvas implements Runnable
{
    private static JFrame frame;

    private Thread thread;

    private boolean isRunning = true;

    private final int width = 240;
    private final int height = 160;
    private final int scale = 3;
    
    private BufferedImage image;

    public Game() 
    {
        setPreferredSize(new Dimension(width * scale, height * scale));
        initFrame();
        image = new BufferedImage(width, height,BufferedImage.TYPE_INT_RGB);
    }
    public void initFrame()
    {
        frame = new JFrame("TESTE");
        frame.add(this);
        frame.setResizable(false);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public synchronized void start()
    {
        thread = new Thread(this);
        isRunning = true;
        thread.start();
    }
    public synchronized void stop()
    {
    	isRunning = false;
    	try 
    	{
			thread.join();
		} catch (InterruptedException e) 
    	{
			e.printStackTrace();
		}
    }
    

    public static void main(String[] args) throws Exception 
    {
        Game game = new Game();
        game.start();
        
    }

    @Override
    public void run()
    {
        long lasTime = System.nanoTime();
        double amountTicks = 60.0;
        double ns = 1000000000 / amountTicks;
        double delta = 0;
        
        int frames = 0;
        double timer = System.currentTimeMillis();

        while(isRunning)
        {
            long now = System.nanoTime();
            delta += (now - lasTime) / ns;
            lasTime = now;
            if(delta >= 1)
            {
                tick();
                render();
                frames++;
                delta--;
            }
            if(System.currentTimeMillis() - timer >= 1000)
            {
                System.out.println("FPS: "+ frames);
                frames = 0;
                timer+= 1000;
            }
        }
        stop();
    }
    public void tick()
    {

    }
    public void render()
    {
        BufferStrategy bs = this.getBufferStrategy(); 
        if(bs == null)
        {
        	this.createBufferStrategy(3);
        	return;
        }
        Graphics g = image.getGraphics();
        g.setColor(Color.black);
        g.fillRect(0, 0, width, height);
        
        g.setColor(Color.GREEN);
        g.fillOval(50, 20, 50, 50);
        
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.setColor(Color.white);
        g.drawString("Olá", 20, 20);
        
        g = bs.getDrawGraphics();
        g.drawImage(image, 0, 0, width * scale, height * scale, null);
        bs.show();
    }
    
}
