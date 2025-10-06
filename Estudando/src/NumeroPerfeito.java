import java.util.Scanner;

public class NumeroPerfeito {
    
    boolean ehPerfeito(int numero) {
        int soma = 0;

        
        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) {
                soma += i;
            }
        }

        return soma == numero;
    }

    void main() {
        Scanner scan = new Scanner(System.in);
        IO.println("Informe o número: ");
        int numero = scan.nextInt();

        if (ehPerfeito(numero)) {
            IO.println(numero + " é um número perfeito!");
        } else {
            IO.println(numero + " não é um número perfeito.");
        }
        scan.close();
    }
}
