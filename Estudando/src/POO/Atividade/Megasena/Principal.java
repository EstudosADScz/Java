package POO.Atividade.Megasena;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bilhete meuBilhete = new Bilhete();

        System.out.println("--- Sistema Mega-Sena OO ---");
        
        while (!meuBilhete.estaCompleto()) {
            System.out.print("Digite um número: ");
            int input = scanner.nextInt();

            try {
                meuBilhete.adicionarNumero(input);
                System.out.println("Número adicionado com sucesso!");
                
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage()); 
            }
        }

        System.out.println("\n-----------------------------");
        System.out.println("Bilhete finalizado!");
        
        int[] resultado = meuBilhete.getNumerosOrdenados();
        
        System.out.print("Números sorteados: ");
        for (int n : resultado) {
            System.out.print(n + " ");
        }
        System.out.println();

        scanner.close();
    }
}
