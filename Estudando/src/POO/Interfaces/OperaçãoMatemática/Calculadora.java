package POO.Interfaces.OperaçãoMatemática;

public class Calculadora {
    void main(){
        OperacaoMatematica soma = (a, b) -> a + b;

        OperacaoMatematica subtracao = (a, b) -> a - b;

        OperacaoMatematica multiplicacao = (a, b) -> a * b;

        OperacaoMatematica divisao = (a, b) -> {
            if (b == 0) {
                System.out.println("Erro: Divisão por zero!");
                return 0.0;
            }
            return a / b;
        };

        // --- Testando as operações ---
        double num1 = 20.0;
        double num2 = 5.0;

        System.out.println("--- Testando Operações ---");
        System.out.println("Número 1: " + num1);
        System.out.println("Número 2: " + num2);
        System.out.println("---------------------------");

        // Usando o método .executar() de cada lambda
        System.out.println("Soma: " + soma.executar(num1, num2));
        System.out.println("Subtração: " + subtracao.executar(num1, num2));
        System.out.println("Multiplicação: " + multiplicacao.executar(num1, num2));
        System.out.println("Divisão: " + divisao.executar(num1, num2));

        // Testando a divisão por zero
        System.out.println("---------------------------");
        System.out.println("Testando divisão por zero:");
        System.out.println("Divisão: " + divisao.executar(num1, 0));
    }
}

    
