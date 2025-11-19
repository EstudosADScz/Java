import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DesafioUM {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, insira uma frase:");
        String frase = scanner.nextLine();
        scanner.close();

        Map<String, Integer> contagens = contarPalavrasOrdenadas(frase);

        System.out.println("\n Contagem de Palavras Únicas (em ordem alfabética):");
        System.out.println("-".repeat(50));
        System.out.printf("%-15s %s\n", "PALAVRA", "CONTAGEM");
        System.out.println("-".repeat(50));
        
        for (Map.Entry<String, Integer> entrada : contagens.entrySet()) {
            System.out.printf("%-15s %d\n", entrada.getKey(), entrada.getValue());
        }
    }

    public static Map<String, Integer> contarPalavrasOrdenadas(String frase) {
        String fraseLower = frase.toLowerCase();
        Map<String, Integer> mapaContagens = new TreeMap<>();
        Pattern pattern = Pattern.compile("[a-z]+"); 
        Matcher matcher = pattern.matcher(fraseLower);

        while (matcher.find()) {
            String palavra = matcher.group();
            int contagemAtual = mapaContagens.getOrDefault(palavra, 0);
            mapaContagens.put(palavra, contagemAtual + 1);
        }

        return mapaContagens;
    }
}