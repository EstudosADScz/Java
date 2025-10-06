package Exercícios;
import java.util.Scanner;

public class Senha {
    void main(){
        Scanner scan = new Scanner(System.in);

        IO.println("Informe sua senha: ");
        String senha = scan.nextLine();

        for(int i = 3; i >= 1; i--){
            IO.println("Informe sua senha: ");
            String senhausuario = scan.nextLine();

            if(senhausuario.equals(senha)){
                IO.println("Senha correta.");
                return;
            }

            IO.println("Senha Incorreta.");
        }

        scan.close();
    }
}
