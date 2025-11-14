package algorithms;

import java.util.Scanner;

public class Ex05 {
    void main() {
        Scanner scan = new Scanner(System.in);
        int num;
        int maior= 0, menor = 0, soma = 0, cont_par = 0, cont_multiplo_tres = 0;

        for (int i = 1; i <= 3; i++) {
            IO.println("Informe um número inteiro positivo: ");
            num = scan.nextInt();

            if (num > maior) {
                maior = num;
            }
            if (i == 1 || num < menor) {
                menor = num;
            }
            if (num % 2 == 0) {
                soma += num;
                cont_par++;
            }
            if (num % 3 == 0) {
                cont_multiplo_tres++;
            }
        }
        int media = soma / cont_par;
        IO.println("Maior: " + maior + ", menor : " + menor);
        IO.println("A média dos números pares é: " + media);
        IO.println("Multiplos de 3: " + cont_multiplo_tres);
    }
}
