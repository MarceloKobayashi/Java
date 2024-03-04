import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double media = 0;
        double nota;

        System.out.println("Digite a quantidade de notas: ");
        int votos = leitura.nextInt();
        int quantia = votos;

        while (votos != 0){
            System.out.println("Digite sua avaliação para o filme: ");
            nota = leitura.nextDouble();
            media += nota;
            votos--;
        }
        System.out.println("A média de notas é: " + media/quantia);
    }
}
