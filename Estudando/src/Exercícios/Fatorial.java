package Exercícios;
import java.util.Scanner;

public class Fatorial {
    int numFatorial(int num){
        if(num == 1){
            return 1;
        }

        return num * numFatorial(num -1);

    }

    void main(){
        Scanner scan = new Scanner(System.in);

        IO.println("Informe o número: ");
        int num = scan.nextInt();

        IO.println("O valor de " + num + " fatorial eh: " + numFatorial(num));
        scan.close();
    }
    
}
