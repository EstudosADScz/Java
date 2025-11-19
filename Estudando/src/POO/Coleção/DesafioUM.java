import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DesafioUM {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, insira uma frase (assumindo que não tem acentuação):");
        String frase = scanner.nextLine();
        scanner.close();

        Set<String> palavrasUnicas = encontrarPalavrasUnicas(frase);

        System.out.println("\n Palavras Únicas (em ordem alfabética, processando apenas a-z):");
        for (String palavra : palavrasUnicas) {
            System.out.println("- " + palavra);
        }
    }

    public static Set<String> encontrarPalavrasUnicas(String frase) {
        String fraseLower = frase.toLowerCase();

        Set<String> palavrasOrdenadas = new TreeSet<>();

        Pattern pattern = Pattern.compile("[a-z]+"); 
        Matcher matcher = pattern.matcher(fraseLower);

        while (matcher.find()) {
            String palavra = matcher.group();
            palavrasOrdenadas.add(palavra);
        }
        return palavrasOrdenadas;

    }
}

