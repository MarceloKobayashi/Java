import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100);
        int tentativas = 0;
        while (tentativas < 5) {
            System.out.println("Digite um número entre 0 e 100: ");
            int chute = leitura.nextInt();
            tentativas++;

            if (chute == numeroAleatorio) {
                System.out.println("Ganhou");
                break;
            } else if (chute < numeroAleatorio) {
                System.out.println("Número é maior que " + chute);
            } else {
                System.out.println("Número é menor que " + chute);
            }
        }
        if (tentativas == 5) {
            System.out.println("Se fudeu! O número era " + numeroAleatorio);
        }
    }
}