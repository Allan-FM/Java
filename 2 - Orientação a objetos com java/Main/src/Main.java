public class Main extends Player
{
	
	private String nome = "Allan";
	private int[] numeros;
	public static final int VIDA_MAXIMA = 100;
	
	
	//Metodo construtor
	public Main(int n1, int n2)
	{
		super(n1, n2);
		this.vidaInicial = 111;
		numeros = new int[100];
	}
	public String getNome()
	{
		return nome;
	}
	public static void main(String[] args)
	{
		Main main =  new Main(100, 200);
		System.out.println(main.getNome());
	}
}