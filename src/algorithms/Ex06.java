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
                IO.println("Senha incorreta");
            }
            IO.println("Senha correta!!!");
        }
        scan.close();
    }
}
