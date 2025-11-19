import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DesafioUM {

    public static void main(String[] args) {
        // 1. Configurar entrada
        Scanner scanner = new Scanner(System.in);

        // 2. Solicitar a frase ao usuário
        System.out.println("Por favor, insira uma frase (assumindo que não tem acentuação):");
        String frase = scanner.nextLine();
        scanner.close();

        // 3. Processar a frase e obter as palavras únicas ordenadas
        Set<String> palavrasUnicas = encontrarPalavrasUnicas(frase);

        // 4. Exibir o resultado
        System.out.println("\n✅ Palavras Únicas (em ordem alfabética, processando apenas a-z):");
        for (String palavra : palavrasUnicas) {
            System.out.println("- " + palavra);
        }
    }

    public static Set<String> encontrarPalavrasUnicas(String frase) {
        // Converter a frase para minúsculas
        String fraseLower = frase.toLowerCase();

        // Usamos um TreeSet para unicidade e ordenação alfabética
        Set<String> palavrasOrdenadas = new TreeSet<>();

        // *** AQUI ESTÁ A MUDANÇA: A EXPRESSÃO REGULAR ***
        // Pattern foca apenas em letras ASCII (a-z)
        Pattern pattern = Pattern.compile("[a-z]+"); 
        Matcher matcher = pattern.matcher(fraseLower);

        // Iterar sobre todas as correspondências (palavras)
        while (matcher.find()) {
            String palavra = matcher.group();
            // Adicionar a palavra ao TreeSet.
            palavrasOrdenadas.add(palavra);
        }

        return palavrasOrdenadas;
    }
}