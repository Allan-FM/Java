public class Game 
{
	private Player player;
	private Inimigo inimigo;
	
	public static void main(String[] args)
	{
		Game game = new Game();
		Player player =  game.GetPlayer();
		// Inimigo inimigo = game.GetInimigo();
		// System.out.println(player);
		// System.out.println(inimigo);
	}
	public Game()
	{
		//player = new Player();
		player = new Tipo1();
		if(player instanceof Tipo1)
		{
			
		}
		else if(player instanceof Player)
		{

		}
		inimigo = new Inimigo();
	}
	public Player GetPlayer()
	{
		return player;
	}
	public Inimigo GetInimigo()
	{
		return inimigo;
	}
}
