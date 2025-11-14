package algorithms;

import java.util.Scanner;

public class Ex08 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a letra que deseja testar: ");
        char teste = sc.next().charAt(0); //Usa-se char.At(); Pois char nao possui um metodo direto como nextLine
        char letra = Character.toLowerCase(teste);

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.println(teste + " é uma VOGAL.");

        } else if (letra >= 'a' && letra <= 'z') {
            // Usamos a tabela Unicode a nosso favor!
            // Se é uma letra (entre 'a' e 'z') e não é vogal...
            System.out.println(teste + " é uma CONSOANTE.");

        } else {
            System.out.println(teste + " NÃO É UMA LETRA.");
        }
        sc.close();
    }
}


