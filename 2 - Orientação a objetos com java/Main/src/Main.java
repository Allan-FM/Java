public class Main
{
	//public, private, protected
	//static
	//void, int, string
	
	public static void main(String[] args)
	{
		/*
		Player player = new Player();
		player.nascer();
		Player2 player2 = new Player2();
		player2.outroMetodo();
		*/
		
		int[] n1 = new int[3];
		String[] nome = new String[3];
		n1[0] = 10;
		nome[0] = "Allan";
		
		new Main().OutroMetodo(n1, nome);
		
	}
	
	public void OutroMetodo(int[] n1, String[] nome)
	{
		System.out.println(n1[0]);
		System.out.println(nome[0]);
	}
}