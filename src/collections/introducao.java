package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class introducao {

    public static void main(String[] args) {

        // List<String> nomes = new ArrayList<>();

//        nomes.add("João");
//        nomes.add("Maria");
//        nomes.add(0, "Pedro");
//        System.out.println(nomes);
//        nomes.remove("Maria");
//        System.out.println("Indice de Joao: " + nomes.indexOf("João"));
//        System.out.println("João existe? "+nomes.contains("João"));
//        System.out.println("Lista inversa: " + nomes.reversed());
//
//        List<String> nomes = new LinkedList<>(); //Duplamete encadeada, possui ponteiros que referenciam os dados sucessores e anteriores entre si

        // Usando a interface Deque com a implementação ArrayDeque para uma pilha moderna
        Deque<String> nomes = new ArrayDeque<>();
        nomes.push("João");
        nomes.push("Maria");
        nomes.push("José");

        System.out.println("Topo: " + nomes.peek());

        while (!nomes.isEmpty()) {
            System.out.println(nomes.pop());
        }

        System.out.println(nomes);


    }
}
