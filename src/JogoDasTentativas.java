import java.util.Random;
import java.util.Scanner;
import java.util.Random;

public class JogoDasTentativas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String respostasDigitadas = "";
        System.out.println("-------------------------");
        System.out.println("Jogo das tentativas");
        System.out.println("-------------------------");
        System.out.println("Instru��es do jogo:");
        System.out.println("Voc� deve digitar um n�mero que seja igual ao n�mero aleat�rio");//Texto informativo
        System.out.println("-------------------------");
        System.out.println("Tabela de pontos: Se acertar o n�mero aleat�rio - Vale: 10 pontos (Nota m�xima)");//Texto informativo
        System.out.println("Se voc� digitar um n�mero acima do n�mero aleat�rio - Vale: 5 pontos");//Texto informativo
        System.out.println("Se voc� digitar um n�mero abaixo do n�mero aleat�rio - Vale: 5 pontos "); //Texto informativo
        System.out.println("-------------------------\n");
        System.out.print("Digite o seu nome para se inscrever no jogo: "); // Texto interativo com o usu�rio
        String nome; // conjunto de caracteres
        nome = input.nextLine(); // onde a str vai ser introduzida
        System.out.println("------------ (AEEEEE, Voc� se inscreveu no jogo *-*) ------------"); // texto interativo

        System.out.println("Ol� " + nome +", seja bem vindo(a) ao jogo das tentativas."); // texto interativo
        System.out.println("Agora, tente acertar o n�mero aleat�rio ou o n�meros pr�ximos a ele (boa sorte)\n");
         // n�mero inteiro que o usu�rio vai informar
        System.out.print("Dica: informe um n�mero entre 1 e 30\n");

        int resultadoFinal = 0;

        do {

            Random numeroAleatorio = new Random(); // classe de n�mero aleat�rio
            int numeroAletorio = numeroAleatorio.nextInt(30) + 1; // classe de n�mero aleat�rio
            int valorAcima = numeroAletorio + 1; // vari�vel n�mero aleat�rio
            int valorAbaixo = numeroAletorio - 1; // vari�vel n�mero aleat�rio


            int pontuacao10 = 10; // n�mero inteiro
            int pontuacao5 = 5; // n�mero inteiro

            System.out.print("Digite um n�mero: "); // Texto interativo com o usu�rio
            int numeroDigitadoPeloUsuario = input.nextInt();


            if (numeroDigitadoPeloUsuario == numeroAletorio) { // estrutura condicional
                System.out.println("Parab�ns voc� acertou o n�mero aleat�rio! ");
                System.out.println("Voc� ganhou " + pontuacao10 + " pontos(nota m�xima) ");
                System.out.print("O n�mero aleat�rio era: " + numeroAletorio);
                resultadoFinal += 10;
                System.out.println();

            } else if (numeroDigitadoPeloUsuario == valorAcima) { // estrutura condicional
                System.out.println("Na trave, quase... voc� ganhou " + pontuacao5 + " pontos.");
                System.out.print("O n�mero aleat�rio era: " + numeroAletorio);
                resultadoFinal += 5;
                System.out.println();

            } else if (numeroDigitadoPeloUsuario == valorAbaixo) { // estrutura condicional
                System.out.println("Na trave, quase... voc� ganhou " + pontuacao5 + " pontos");
                System.out.print("O n�mero aleat�rio era: " + numeroAletorio);
                resultadoFinal += 5;
                System.out.println();

            } else if (numeroDigitadoPeloUsuario < 0) { // estrutura condicional
                System.out.println("N�mero inv�lido, digite apenas n�meros positvos!!!");

            } else { // estrutura condicional
                System.out.println("Voc� perdeu, tente novamente! ");
                System.out.print("O n�mero aleat�rio era: " + numeroAletorio);
                System.out.println();
                System.out.println("Total de pontos: 0 ");
                System.out.println();

            }
                System.out.print("Voc� quer jogar novamente? Sim ou N�o: ");
                respostasDigitadas = input.next();
        } while (respostasDigitadas.equalsIgnoreCase("sim"));

        System.out.print("O seu total de pontos no jogo foi de: " + resultadoFinal);


    }


}

