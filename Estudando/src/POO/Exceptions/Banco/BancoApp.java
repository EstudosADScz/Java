package POO.Exceptions.Banco;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BancoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaCorrente conta = new ContaCorrente(123, "Lopes", 1000.0, 500.0);

        System.out.println("Bem-vindo ao Banco Digital, " + conta.getTitular() + "!");
        System.out.println("Conta: " + conta.getNumero());

        int opcao = 0;
        while (opcao != 4) {
            System.out.println("\n--- MENU DE OPÇÕES ---");
            System.out.println("1. Sacar");
            System.out.println("2. Depositar");
            System.out.println("3. Ver Saldo");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.print("Digite o valor para sacar: ");
                        double valorSaque = scanner.nextDouble();
                        try {
                            conta.sacar(valorSaque);
                            System.out.println("Saque de R$" + valorSaque + " realizado com sucesso!");
                        } catch (SaldoInsuficienteException | LimiteExcedidoException e) {
                            System.out.println("Erro ao sacar: " + e.getMessage());
                        }
                        break;
                    case 2:
                        System.out.print("Digite o valor para depositar: ");
                        double valorDeposito = scanner.nextDouble();
                        conta.depositar(valorDeposito);
                        System.out.println("Depósito de R$" + valorDeposito + " realizado com sucesso!");
                        break;
                    case 3:
                        System.out.printf("Seu saldo atual é: R$%.2f\n", conta.getSaldo());
                        break;
                    case 4:
                        System.out.println("Obrigado por usar nosso banco. Até logo!");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida. Por favor, digite um número.");
                scanner.next();
            }
        }

        scanner.close();
    }
}