import java.awt.Canvas;
import java.awt.Dimension;
import javax.swing.JFrame;

public class Game extends Canvas implements Runnable
{
    private static JFrame frame;

    private Thread thread;

    private boolean isRunning = true;

    private final int width = 160;
    private final int height = 120;
    private final int scale = 3;

    public Game() 
    {
        setPreferredSize(new Dimension(width * scale, height * scale));
        initFrame();

        
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
    }
    public void tick()
    {

    }
    public void render()
    {

    }
}
