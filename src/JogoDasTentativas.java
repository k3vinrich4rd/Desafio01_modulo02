import java.util.Random;
import java.util.Scanner;
import java.util.Random;

public class JogoDasTentativas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Inicio do jogo
        System.out.println("Jogo das tentativas\n");
        System.out.println("Instru��es do jogo:");
        System.out.println("Voc� deve digitar um n�mero que seja igual ao n�mero aletorio \n");//Texto informativo
        System.out.println("Tabela de pontos: Acertar o n�mero aleat�rio - 10 pontos" );//Texto informativo
        System.out.println("Se digitar um n�mero acima do n�mero aleat�rio - 5 pontos");//Texto informativo
        System.out.println("Se digitar um n�mero abaixo do n�mero aleat�rio - 5 pontos \n"); //Texto informativo
        System.out.print("Digite o seu nome para se inscrever no jogo: "); // Texto interativo com o usu�rio
        String nome; // conjunto de caracteres
        nome = input.nextLine(); // onde a str vai ser introduzida
        System.out.println(); // para pular linha
        System.out.println("------------ (AEEEEE, Voc� se inscreveu no jogo *-*) ------------\n"); // texto interativo

        System.out.println("Ol� " + nome + ", seja bem vindo(a) ao jogo das tentativas."); // texto interativo
        System.out.println("Agora, acerte o n�mero aleat�rio e ganhe pontos se acertar.\n"); // texto interativo
        System.out.print("Digite um n�mero: "); // Texto interativo com o usu�rio
        int numeroDigitadoPeloUsuario = input.nextInt(); // n�mero inteiro que o usu�rio vai informar
        System.out.println(); // para pular linha

        Random numeroAleatorio = new Random(); // classe de n�mero aleat�rio
        int numeroAletorio = numeroAleatorio.nextInt(10) + 1; // classe de n�mero aleat�rio
        int valorAcima = numeroAletorio + 1; // vari�vel n�mero aleat�rio
        int valorAbaixo = numeroAletorio - 1; // vari�vel n�mero aleat�rio

        int pontuacao10 = 10; // n�mero inteiro
        int pontuacao5 = 5; // n�mero inteiro


        if (numeroDigitadoPeloUsuario == numeroAletorio) { // estrutura condicional
            System.out.println("Parab�ns voc� acertou o n�mero aleat�rio! ");
            System.out.println("Voc� ganhou " + pontuacao10 + " pontos(nota m�xima) ");
            System.out.print("O n�mero aleat�rio era: " + numeroAletorio);

        } else if (numeroDigitadoPeloUsuario == valorAcima) { // estrutura condicional
            System.out.println("Na trave, quase... voc� ganhou " + pontuacao5 + " pontos.");
            System.out.print("O n�mero aleat�rio era: " + numeroAletorio);

        } else if (numeroDigitadoPeloUsuario == valorAbaixo) { // estrutura condicional
            System.out.println("Na trave, quase... voc� ganhou " + pontuacao5 + " pontos");
            System.out.print("O n�mero aleat�rio era: " + numeroAletorio);

        } else if (numeroDigitadoPeloUsuario < 0) { // estrutura condicional
            System.out.println("N�mero inv�lido, digite apenas n�meros positvos");

        } else { // estrutura condicional
            System.out.println("Voc� perdeu, tente novamente! ");
            System.out.print("O n�mero aleat�rio era: " + numeroAletorio);
            System.out.println();
            System.out.println("Total de pontos: 0 ");

        }

    }


}

