public class Main {
    public static void main(String[] arg) {
        System.out.println("Esse é o Screen Match!");               //sla
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.9;

        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);

        String sinopse;
        sinopse = """
                Filme Top Gun:
                    Filme de aventura com galã dos anos 80
                    Muito Bom!
                Ano de Lançamento:
                """ + anoDeLancamento;
        System.out.println(sinopse);

        int classificacao = (int) (media / 2);
        System.out.println(classificacao);

    }
}