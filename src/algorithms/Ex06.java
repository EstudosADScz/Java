package algorithms;

import java.util.Scanner;

public class Ex06 {
    void main() {
        Scanner scan = new Scanner(System.in);
        String senha = "123456";

        for (int i = 1; i <= 3; i++) {
            IO.println("Informe uma senha de 6 algarismos: ");
            String senhaTeste = scan.nextLine();

            if (senhaTeste.equals(senha)) {
                IO.println("Senha correta!!!");
                break; // Sai do loop se a senha estiver correta
            } else {
                IO.println("Senha incorreta. Tentativas restantes: " + (3 - i));
            }
        }
        scan.close();
    }
}
