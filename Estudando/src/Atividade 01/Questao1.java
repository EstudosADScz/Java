import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int nota; int soma = 0;

        for(int i = 1; i <= 3; i++){
            IO.println("Informe a " + i + " nota:");
            nota = scan.nextInt();

            if(i == 3){
                soma = soma + (nota*2);
            }
            else{
            soma += nota;
            }
        }

        float media = (float)soma / 3;

        IO.println("A media ponderada das notas foi: " + media);
        scan.close();
    }


    
}
