import java.awt.Canvas;
import java.awt.Dimension;
import javax.swing.JFrame;

public class Game extends Canvas implements Runnable
{
    private static JFrame frame;
    private final int width = 160;
    private final int height = 120;
    private final int scale = 3;

    public Game() 
    {
        setPreferredSize(new Dimension(width * scale, height * scale));
        frame = new JFrame("TESTE");
        frame.add(this);
        frame.setResizable(false);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }

    public static void main(String[] args) throws Exception 
    {
        Game game = new Game();
    }

    @Override
    public void run()
    {
        
    }
}
