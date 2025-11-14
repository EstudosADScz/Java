package algorithms;

import java.util.Scanner;

public class Ex07 {
    void main() {
        Scanner scan = new Scanner(System.in);

        IO.println("Informe um número de 3 dígitos: ");
        int num = scan.nextInt();
        int soma = 0;

        for (int i =  1; i <= 3; i++) {
            soma += num % 10;
            num = num / 10;
        }
        IO.println("A soma entre os algarismos desse nuemero é: " + soma);
        scan.close();
    }
}
