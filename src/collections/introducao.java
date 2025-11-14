package collections;

import java.util.Stack;

public class introducao {

    static void main() {

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

        Stack<String> nomes = new Stack<>();
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
