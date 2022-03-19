import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("Por favor, digite seu nome -> ");
        String nome = in.nextLine();
        System.out.println("Por favor, digite sua idade -> ");
        String idade = in.nextLine();
        System.out.println("Por favor, digite sua peso -> ");
        String peso = in.nextLine();
        System.out.println("Por favor, digite sua Estado -> ");
        String estado = in.nextLine();
        System.out.println("Por favor, digite sua Pais -> ");
        String pais = in.nextLine();
        System.out.println("Seu nome e -> " + nome);
        System.out.println("Sua idade e -> " + idade + "Anos");
        System.out.println("Seu peso e -> " + peso + "Kg");
        System.out.println("Seu estado e -> " + estado);
        System.out.println("Seu Pais e -> " + pais);
        */
        String nome;
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Seja bem vindo! Por favor digite ou seu nome: ");
        nome = in.nextLine();
        System.out.println("Prazer em te conhcer " + nome);
        System.out.println("Voce deseja avancar em qual direcao? (w = frente ou s = atras)");
        String comando = in.nextLine();
        if(comando.equals("w"))
        {
            System.out.println("Voce esta indo para frente!");
            System.out.println("Oque voce deseja fazer? (a = atacar ou  c = correr)");
            comando = in.nextLine();
            if(comando.equals("a"))
            {
                System.out.println("Voce esta atancando o inimigo!");
            }
            else
            {
                System.out.println("Voce correu! O jogo terminou.");
            }
        }
        else if(comando.equals("s"))
        {
            System.out.println("Voce foi para tras!");
            System.out.println("Voce caiu em um precipício!!!!");
            System.out.println("Reiniciando o jogo...");
        }

    }
}
