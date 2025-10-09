import java.util.Scanner;

class GeradorPrimos {
    
    private boolean ehPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void listarPrimosAte(int limite) {
        System.out.println("\nNúmeros primos entre 2 e " + limite + ":");
        for (int i = 2; i <= limite; i++) {
            if (ehPrimo(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}


public class Questao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo (N): ");
        int n = scanner.nextInt();
        
        if (n < 2) {
            System.out.println("Não existem números primos no intervalo informado.");
        } else {
            GeradorPrimos gerador = new GeradorPrimos();
            gerador.listarPrimosAte(n);
        }

        scanner.close();
    }
}