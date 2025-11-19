import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class DesafioDOIS {

    public static void main(String[] args) {
        // Número de elementos e limite superior para os números aleatórios
        final int TAMANHO_LISTA = 30;
        final int LIMITE_MAXIMO = 50; // Gera números entre 0 e 49

        // 1. Inserir 30 números aleatórios
        List<Integer> listaOriginal = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < TAMANHO_LISTA; i++) {
            // Adiciona um número aleatório (de 0 até LIMITE_MAXIMO - 1)
            listaOriginal.add(random.nextInt(LIMITE_MAXIMO));
        }

        System.out.println("Lista Original Gerada (" + TAMANHO_LISTA + " elementos):");
        System.out.println(listaOriginal);

        // --- Operação A: Classificar em Ordem Crescente ---
        System.out.println("\n" + "-".repeat(50));
        System.out.println("a. Classificação em Ordem Crescente:");
        classificarCrescente(listaOriginal);
        System.out.println("Lista Crescente: " + listaOriginal);

        // --- Operação B: Classificar em Ordem Decrescente ---
        System.out.println("\n" + "-".repeat(50));
        System.out.println("b. Classificação em Ordem Decrescente:");
        classificarDecrescente(listaOriginal);
        System.out.println("Lista Decrescente: " + listaOriginal);
        
        // --- Operação C: Ordem Crescente Apagando Duplicatas ---
        System.out.println("\n" + "-".repeat(50));
        System.out.println("c. Ordem Crescente Apagando Duplicatas:");
        List<Integer> listaSemDuplicatas = classificarSemDuplicatas(listaOriginal);
        System.out.println("Lista Única e Crescente: " + listaSemDuplicatas);
    }

    
    public static void classificarCrescente(List<Integer> lista) {
        // Usa o método sort padrão que classifica na ordem natural (crescente)
        Collections.sort(lista);
    }

    public static void classificarDecrescente(List<Integer> lista) {
        // Usa o método sort e passa o Comparator.reverseOrder() para inverter a ordem
        Collections.sort(lista, Collections.reverseOrder());
        
        // OU, para listas grandes, usar o Lambda:
        // lista.sort(Comparator.reverseOrder());
    }

    public static List<Integer> classificarSemDuplicatas(List<Integer> lista) {
        // 1. Usar um TreeSet:
        // - Set garante a unicidade dos elementos (remove duplicatas).
        // - Tree garante que os elementos sejam armazenados em ordem natural (crescente).
        Set<Integer> conjuntoUnico = new TreeSet<>(lista);

        // 2. Converte o Set de volta para uma List para exibição
        return new ArrayList<>(conjuntoUnico);
    }
}

