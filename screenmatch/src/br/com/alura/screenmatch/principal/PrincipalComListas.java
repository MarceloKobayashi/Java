package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        Serie seriado = new Serie("Peaky Blinders", 2010);
        Filme outroFilme = new Filme("Avatar", 2023);
        Filme filmeDoMarcelo = new Filme("Dogville", 2003);

        meuFilme.avalia(9);
        outroFilme.avalia(8);
        filmeDoMarcelo.avalia(10);

        List<Titulo> lista = new LinkedList<>();
        lista.add(filmeDoMarcelo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(seriado);

        for (Titulo item: lista) {
            System.out.println(item);
            if (item instanceof Filme filme && filme.getClassificacao() > 4) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Marcelo Honda");
        buscaPorArtista.add("A");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println(buscaPorArtista);

        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(lista);
    }
}
