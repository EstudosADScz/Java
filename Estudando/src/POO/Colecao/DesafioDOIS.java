package POO.Colecao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class DesafioDOIS {

    public static void main(String[] args) {
        final int TAMANHO_LISTA = 30;
        final int LIMITE_MAXIMO = 50;

        List<Integer> listaOriginal = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < TAMANHO_LISTA; i++) {
            listaOriginal.add(random.nextInt(LIMITE_MAXIMO));
        }

        System.out.println("Lista Original Gerada (" + TAMANHO_LISTA + " elementos):");
        System.out.println(listaOriginal);

        classificarCrescente(listaOriginal);
        System.out.println("Lista Crescente: " + listaOriginal);

        classificarDecrescente(listaOriginal);
        System.out.println("Lista Decrescente: " + listaOriginal);
        
        List<Integer> listaSemDuplicatas = classificarSemDuplicatas(listaOriginal);
        System.out.println("Lista Sem Duplicatas e Crescente: " + listaSemDuplicatas);
    }

    public static void classificarCrescente(List<Integer> lista) {
        Collections.sort(lista);
    }

    public static void classificarDecrescente(List<Integer> lista) {
        Collections.sort(lista, Collections.reverseOrder());
    }

    public static List<Integer> classificarSemDuplicatas(List<Integer> lista) {
        Set<Integer> conjuntoUnico = new TreeSet<>(lista);
        return new ArrayList<>(conjuntoUnico);
    }
}
