package algorithms;

import java.util.Scanner;

public class Ex03 {
    void main() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe um numero: ");
        int num = scan.nextInt();


        if (perfeito(num)) {
            System.out.println("É perfeito!");
        } else {
            System.out.println("Não é perfeito!");
        }
        scan.close();
    }

     public boolean perfeito(int n) {
        int soma = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                soma += i;
            }
        }
        return soma == n;
    }
}
