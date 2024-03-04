import java.util.Scanner;

public class temperatura {
    public static void main(String[] arg) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite a escala: ");
        String escala = leitura.nextLine();

        System.out.println("Digite a temperatura:");
        double graus = leitura.nextDouble();

        if (escala.equals("Celsius")) {
            escala = "Fahrenheit";
            graus = (graus * 1.8) + 32;
        } else if (escala.equals("Fahrenheit")) {
            escala = "Celsius";
            graus = (graus - 32) / 1.8;
        }
        String mensagem = String.format("A temperatura é de %2f %s", graus, escala);
        System.out.println(mensagem);
    }
}
