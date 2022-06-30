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
        System.out.println("Instruções do jogo:");
        System.out.println("Você deve digitar um número que seja igual ao número aleatório");//Texto informativo
        System.out.println("-------------------------");
        System.out.println("Tabela de pontos: Se acertar o número aleatório - Vale: 10 pontos (Nota máxima)");//Texto informativo
        System.out.println("Se você digitar um número acima do número aleatório - Vale: 5 pontos");//Texto informativo
        System.out.println("Se você digitar um número abaixo do número aleatório - Vale: 5 pontos "); //Texto informativo
        System.out.println("-------------------------\n");
        System.out.print("Digite o seu nome para se inscrever no jogo: "); // Texto interativo com o usuário
        String nome; // conjunto de caracteres
        nome = input.nextLine(); // onde a str vai ser introduzida
        System.out.println("------------ (AEEEEE, Você se inscreveu no jogo *-*) ------------"); // texto interativo

        System.out.println("Olá " + nome +", seja bem vindo(a) ao jogo das tentativas."); // texto interativo
        System.out.println("Agora, tente acertar o número aleatório ou o números próximos a ele (boa sorte)\n");
         // número inteiro que o usuário vai informar
        System.out.print("Dica: informe um número entre 1 e 30\n");

        int resultadoFinal = 0;

        do {

            Random numeroAleatorio = new Random(); // classe de número aleatório
            int numeroAletorio = numeroAleatorio.nextInt(30) + 1; // classe de número aleatório
            int valorAcima = numeroAletorio + 1; // variável número aleatório
            int valorAbaixo = numeroAletorio - 1; // variável número aleatório


            int pontuacao10 = 10; // número inteiro
            int pontuacao5 = 5; // número inteiro

            System.out.print("Digite um número: "); // Texto interativo com o usuário
            int numeroDigitadoPeloUsuario = input.nextInt();


            if (numeroDigitadoPeloUsuario == numeroAletorio) { // estrutura condicional
                System.out.println("Parabéns você acertou o número aleatório! ");
                System.out.println("Você ganhou " + pontuacao10 + " pontos(nota máxima) ");
                System.out.print("O número aleatório era: " + numeroAletorio);
                resultadoFinal += 10;
                System.out.println();

            } else if (numeroDigitadoPeloUsuario == valorAcima) { // estrutura condicional
                System.out.println("Na trave, quase... você ganhou " + pontuacao5 + " pontos.");
                System.out.print("O número aleatório era: " + numeroAletorio);
                resultadoFinal += 5;
                System.out.println();

            } else if (numeroDigitadoPeloUsuario == valorAbaixo) { // estrutura condicional
                System.out.println("Na trave, quase... você ganhou " + pontuacao5 + " pontos");
                System.out.print("O número aleatório era: " + numeroAletorio);
                resultadoFinal += 5;
                System.out.println();

            } else if (numeroDigitadoPeloUsuario < 0) { // estrutura condicional
                System.out.println("Número inválido, digite apenas números positvos!!!");

            } else { // estrutura condicional
                System.out.println("Você perdeu, tente novamente! ");
                System.out.print("O número aleatório era: " + numeroAletorio);
                System.out.println();
                System.out.println("Total de pontos: 0 ");
                System.out.println();

            }
                System.out.print("Você quer jogar novamente? Sim ou Não: ");
                respostasDigitadas = input.next();
        } while (respostasDigitadas.equalsIgnoreCase("sim"));

        System.out.print("O seu total de pontos no jogo foi de: " + resultadoFinal);


    }


}

