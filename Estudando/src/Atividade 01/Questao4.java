import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Grafico {
    private List<Integer> valores;

    public Grafico() {
        this.valores = new ArrayList<>();
    }

    public void adicionarValor(int valor) {
        this.valores.add(valor);
    }

    public void desenhar() {
        System.out.println("\nGRÁFICO DE ASTERISCOS:");
        for (int valor : this.valores) {
            for (int i = 0; i < valor; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

public class Questao4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Grafico grafico = new Grafico();
        final int QUANTIDADE_NUMEROS = 5;

        System.out.println("Digite " + QUANTIDADE_NUMEROS + " números (cada um entre 1 e 30).");

        for (int i = 1; i <= QUANTIDADE_NUMEROS; i++) {
            int numeroLido;
            do {
                System.out.print("Digite o " + i + "º número: ");
                numeroLido = scanner.nextInt();
                if (numeroLido < 1 || numeroLido > 30) {
                    System.out.println("Valor inválido. O número deve estar entre 1 e 30.");
                }
            } while (numeroLido < 1 || numeroLido > 30);
            
            grafico.adicionarValor(numeroLido);
        }

        grafico.desenhar();
        
        scanner.close();
    }
}