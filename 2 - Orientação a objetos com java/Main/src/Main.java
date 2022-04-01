public class Main
{
	
	private String nome = "Allan";
	private int[] numeros;
	public static final int VIDA_MAXIMA = 100;
	
	
	//Metodo construtor
	public Main()
	{
		numeros = new int[100];
	}
	public String getNome()
	{
		return nome;
	}
	public static void main(String[] args)
	{
		Main main =  new Main();
		System.out.println(main.getNome());
	}
}