import java.util.Random;
import java.util.Scanner;

public class JogoDaAdivinhação {
    public static void main(String[] args) {

        Random sorteador = new Random();
        int numeroSecreto = sorteador.nextInt(100 + 1);

        Scanner leitor = new Scanner(System.in);


        int tentativas = 0;

        while (tentativas <= 0 || tentativas > 5) {
            System.out.print("Quantas tentativas? (1 - 5): ");
            tentativas = leitor.nextInt();

            if (tentativas <= 0 || tentativas > 5){
                System.out.println("O número de tentativas está incorreto!");
                System.out.println("Você deve escolher entre 1 e 5!");
            }

        }
        System.out.println();
        int escolhaJogador;
        int i = 1;
        while (i <= tentativas){
        System.out.println("Chute um valor entre 1 e 100:");
        escolhaJogador = leitor.nextInt();

        if (escolhaJogador > numeroSecreto){
            System.out.println("O valor que você chutou é MAIOR que o número secreto!");
        } else if (escolhaJogador < numeroSecreto){
            System.out.println("O valor que você chutou é MENOR que o número secreto!");
        } else {
            System.out.println("Parabéns você ACERTOU!!");

            break;
        }

            i++; // i = i + 1
        }

        if (i > tentativas){
            System.out.println("O número secreto está incorreto!");
            System.out.println("Que pena, você PERDEU!!");
        }

    }


}
