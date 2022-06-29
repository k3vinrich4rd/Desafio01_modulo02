import java.util.Random;
import java.util.Scanner;
import java.util.Random;

public class JogoDasTentativas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Inicio do jogo
        System.out.println("Jogo das tentativas\n");
        System.out.println("Instruções do jogo:");
        System.out.println("Você deve digitar um número que seja igual ao número aletorio \n");//Texto informativo
        System.out.println("Tabela de pontos: Acertar o número aleatório - 10 pontos" );//Texto informativo
        System.out.println("Se digitar um número acima do número aleatório - 5 pontos");//Texto informativo
        System.out.println("Se digitar um número abaixo do número aleatório - 5 pontos \n"); //Texto informativo
        System.out.print("Digite o seu nome para se inscrever no jogo: "); // Texto interativo com o usuário
        String nome; // conjunto de caracteres
        nome = input.nextLine(); // onde a str vai ser introduzida
        System.out.println(); // para pular linha
        System.out.println("------------ (AEEEEE, Você se inscreveu no jogo *-*) ------------\n"); // texto interativo

        System.out.println("Olá " + nome + ", seja bem vindo(a) ao jogo das tentativas."); // texto interativo
        System.out.println("Agora, acerte o número aleatório e ganhe pontos se acertar.\n"); // texto interativo
        System.out.print("Digite um número: "); // Texto interativo com o usuário
        int numeroDigitadoPeloUsuario = input.nextInt(); // número inteiro que o usuário vai informar
        System.out.println(); // para pular linha

        Random numeroAleatorio = new Random(); // classe de número aleatório
        int numeroAletorio = numeroAleatorio.nextInt(10) + 1; // classe de número aleatório
        int valorAcima = numeroAletorio + 1; // variável número aleatório
        int valorAbaixo = numeroAletorio - 1; // variável número aleatório

        int pontuacao10 = 10; // número inteiro
        int pontuacao5 = 5; // número inteiro


        if (numeroDigitadoPeloUsuario == numeroAletorio) { // estrutura condicional
            System.out.println("Parabéns você acertou o número aleatório! ");
            System.out.println("Você ganhou " + pontuacao10 + " pontos(nota máxima) ");
            System.out.print("O número aleatório era: " + numeroAletorio);

        } else if (numeroDigitadoPeloUsuario == valorAcima) { // estrutura condicional
            System.out.println("Na trave, quase... você ganhou " + pontuacao5 + " pontos.");
            System.out.print("O número aleatório era: " + numeroAletorio);

        } else if (numeroDigitadoPeloUsuario == valorAbaixo) { // estrutura condicional
            System.out.println("Na trave, quase... você ganhou " + pontuacao5 + " pontos");
            System.out.print("O número aleatório era: " + numeroAletorio);

        } else if (numeroDigitadoPeloUsuario < 0) { // estrutura condicional
            System.out.println("Número inválido, digite apenas números positvos");

        } else { // estrutura condicional
            System.out.println("Você perdeu, tente novamente! ");
            System.out.print("O número aleatório era: " + numeroAletorio);
            System.out.println();
            System.out.println("Total de pontos: 0 ");

        }

    }


}

