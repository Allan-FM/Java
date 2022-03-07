
public class Main {
	public static void main(String[] args)
	{
		/*               Primeiro program
		System.out.println("Primeiro programa em java!");
		*/
		
		//-------------------------------------------
		
		/*                Variaveis
		int idade = 18;
		System.out.println("Minha idade -> " + idade);
		idade = 19;
		System.out.println("Minha idade -> " + idade);
		//Tipo de Variaveis
		int myNumber = 10;
		String myString = "Allan";
		boolean myBool = true;
		char myChar = 'A';
		double myDouble = 35.3;
		System.out.println(myNumber);
		System.out.println(myString);
		System.out.println(myBool);
		System.out.println(myChar);
		System.out.println(myDouble);
		*/

		//-------------------------------------------
		
		/* 	            Constantes
		final int vidaMaxima = 10;
		//vidaMaxima = 11 -> nao posso mudar o valor pq ela é constante 
		System.out.println(vidaMaxima);
		*/

		//-------------------------------------------

		/*         		Arrays
		String[] nome = new String[5];
		nome[0] = "Allan";
		nome[1] = "Felipe";
		System.out.println(nome[0]);
		//-> Array multidimensional
		String[][] nomes = new String[5][5];
		nomes[0][0] = "Mathues";
		nomes[1][1] = "Allan";
		nomes[2][2] = "Felipe";
		System.out.println(nomes[0][0]);
		*/

		//-------------------------------------------

		//				Condicoes
		//<, >, ==, !=
		/*
		if 
		else if
		else
		*/
		/*
		int vida = 101;
		if(vida > 100)//<, >, ==, !=
		{
			System.out.println("A vida é maior que 100");
		}
		else
		{
			System.out.println("A vida nao é maior que 100");
		}
		String nome = "Allan";
		if(nome == "Allan")
		{
			System.out.println("O nome é igual ah " + nome);
		}
		else if(nome == "joao")
		{
			System.out.println("O nome é igual ah " + nome);
		}
		else
		{
			System.out.println("Nenhum nome é igual!");
		}
		boolean var = true;
		if(var == true)
		{
			System.out.println("Verdade");
		}
		else
		{
			System.out.println("Falso");
		}
		*/
		
		//-------------------------------------------

		/* 			Switch - Case
		int vida = 100;
		switch(vida)
		{
			case 90:
			System.out.println("Minha vida é 90");
				break;
			case 30:
			System.out.println("Minha vida é 30");
				break;
			default:
			System.out.println("Nenhum condicao bateu!");
				break;
		}
		*/

		//-------------------------------------------


		/*				 Operações avançadas e operações matemáticas
		int vida1 = 100;
		int vida2 = 200;
		int vida3 = 300;
		int vidaFinal = vida1 + vida2 + vida3;
		//System.out.println(vidaFinal);
		//System.out.println((vida2 - vida1) / 2 + vida3);
		
		String nomeDoPlayer = "Mathues";
		// && , ||, >=
		if(nomeDoPlayer != "Allan")
		{
			System.out.println("Começar o jogo!");

		}	
		*/
	}
}
