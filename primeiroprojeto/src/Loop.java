import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double media = 0;
        double nota;

        System.out.println("Digite a quantidade de notas: ");
        int votos = leitura.nextInt();

        for (int i = 0; i < votos; i++) {
            System.out.println("Digite sua avaliação para o filme: ");
            nota = leitura.nextDouble();
            media += nota;
        }
        System.out.println("A média de notas é: " + media/4);
    }
}