package algorithms;

import java.util.Scanner;

public class Ex04 {
    public int fatorialRecursivo(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * fatorialRecursivo(n - 1);
    }


    void main() {
        Scanner scan = new Scanner(System.in);

        IO.println("Informe um número que deseja calcular seu fatorial: ");

        int num = scan.nextInt();
        int verificaFatorial = fatorialRecursivo(num);

        IO.println(num + " fatorial é: " + verificaFatorial);
        scan.close();
    }
}
