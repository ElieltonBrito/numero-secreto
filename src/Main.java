import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("""


                                 NUMERO SECRETO

                Você tem 5 chances de acertar qual é o numero escondido de 0 a 100

                                      BOA SORTE!!!
                """);

        int numeroDeTentativas = 0;
        int numeroAleatorio = new Random().nextInt(50);
        int numero = 0;

        Scanner ler = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Tente acertar o número: ");
            numero = ler.nextInt();

            if (numero < numeroAleatorio) {
                System.out.println("O número digitado é menor que o número escondido");

            }

            if (numero > numeroAleatorio) {
                System.out.println("O número digitado é maior que o número escondido");
            }

            if (numero == numeroAleatorio) {
                System.out.println("Você acertou");
                break;
            }

        }
        if (numero != numeroAleatorio) {

            System.out.println("Você perdeu... O numero escondido é: " + numeroAleatorio);
        }
    }
}
