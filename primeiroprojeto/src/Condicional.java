import java.util.Objects;

public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;
        String tipoPlano = "normal";

        switch (anoDeLancamento) {
            case 2022 :
                System.out.println("Lançamento que os clientes estão curtindo!");
                break;
            default:
                System.out.println("Filme desatualizado!");
                break;
        }

        if (incluidoNoPlano || tipoPlano.equals("plano")) {
            System.out.println("Filme liberado");
        } else {
            System.out.println("Deve pagar a locação");
        }
    }
}
