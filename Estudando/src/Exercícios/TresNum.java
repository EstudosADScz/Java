package Exercícios;
import java.util.Scanner;

public class TresNum {
    void main(){
        Scanner scan = new Scanner(System.in);

        int num, i, maior = 0, menor = 0, soma = 0, cont = 0, cont3 = 0;
        float media = 0;

        for(i = 1; i <= 3; i++){
            IO.println("Informe o numero: ");
            num = scan.nextInt();

            if(num > maior){
                maior = num;
            }
            if(i == 1 || num < menor){
                menor = num;
            }

            if(num % 2 == 0){
                soma += num;
                cont ++;
                media = soma / cont;

            }

            if(num % 3 == 0){
                cont3 ++;
            }
        }

        IO.println("O maior num eh: " + maior);
        IO.println("O menor num eh: " + menor);
        IO.println("A media dos numeros pares eh: " + media);
        IO.println("Quantidade de multiplos de 3: " + cont3);
        scan.close();
    }
    
}
