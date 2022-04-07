import java.util.ArrayList;

public class Game implements Runnable
{
    private boolean isRunning;
    private Thread thread;
    private ArrayList<Entidades> entidades = new ArrayList<>();

    public Game()
    {
        entidades.add(new Entidades());
        entidades.add(new Entidades());
        entidades.add(new Entidades());
        entidades.add(new Entidades());
        for(int i = 0; i < entidades.size(); i++)
        {
            System.out.println("ola");
        }
    }
    public static void main(String[] args)
    {
        Game game =  new Game();
        game.Start();
    }
    
    public synchronized void Start()
    {
        isRunning = true;
        thread =  new Thread(this);
        thread.start();
    }    
    @Override
    public void run() 
    {
        //System.out.println("jogo começou!");
        while(isRunning)
        {
            tick();
            render();
            //FPS
            try 
            {
                Thread.sleep(1000/60);
            } catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
        }
    }
    //Atualizar o jogo
    public void tick()
    {
        //System.out.println("tick");
    }
    //Renderizar o jogo
    public void render()
    {
        //System.out.println("render");
    }
}
