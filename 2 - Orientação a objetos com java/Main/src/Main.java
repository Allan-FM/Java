public class Main extends TesteAbstract
{
    public static void main(String[] args) 
    {
        // // Player player = new Player();
        // // player.playerStart();
        // // Enemy enemy = new Enemy();
        // // enemy.enemyStart();
        // Player player2 = new Player();
        // player2.playerLife(0);
    }
    public void chamarMetodoAbstrato()
    {
        IniciarJogo();
    }

    public void instaciateMain2()
    {
        new Main2().println();
    }
    private class Main2
    {
        public void println()
        {
           // System.out.println("Chamando metodo!");
        }
    }
   
}
