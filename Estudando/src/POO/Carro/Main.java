package POO.Carro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Cria o objeto Carro 1 usando o construtor vazio
        Carro carro1 = new Carro();

        // Coletando dados para o primeiro carro
        System.out.println("--- Cadastro do Carro 1 ---");
        System.out.print("Digite a marca: ");
        carro1.setMarca(scanner.nextLine());

        System.out.print("Digite o modelo: ");
        carro1.setModelo(scanner.nextLine());

        System.out.print("Digite o ano: ");
        carro1.setAno(Integer.parseInt(scanner.nextLine()));

        System.out.print("Digite a cor: ");
        carro1.setCor(scanner.nextLine());

        // 2. Cria o objeto Carro 2 usando o construtor vazio
        Carro carro2 = new Carro();

        // Coletando dados para o segundo carro
        System.out.println("\n--- Cadastro do Carro 2 ---");
        System.out.print("Digite a marca: ");
        carro2.setMarca(scanner.nextLine());
        System.out.print("Digite o modelo: ");
        carro2.setModelo(scanner.nextLine());
        System.out.print("Digite o ano: ");
        carro2.setAno(Integer.parseInt(scanner.nextLine()));
        System.out.print("Digite a cor: ");
        carro2.setCor(scanner.nextLine());

        System.out.println("\n--- Dados do Carro 1 ---");
        System.out.println("Marca: " + carro1.getMarca());
        System.out.println("Modelo: " + carro1.getModelo());
        System.out.println("Ano: " + carro1.getAno());
        System.out.println("Cor: " + carro1.getCor());
        
        System.out.println("\n--- Dados do Carro 2 ---");
        System.out.println("Marca: " + carro2.getMarca());
        System.out.println("Modelo: " + carro2.getModelo());
        System.out.println("Ano: " + carro2.getAno());
        System.out.println("Cor: " + carro2.getCor());

        scanner.close();
    }
}