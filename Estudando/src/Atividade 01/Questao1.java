
import java.util.Scanner;

class VerificadorMultiplos {
    private int numero;

    public VerificadorMultiplos(int numero) {
        this.numero = numero;
    }

    public String checar() {
        boolean multiploDe3 = (numero % 3 == 0);
        boolean multiploDe5 = (numero % 5 == 0);

        if (multiploDe3 && multiploDe5) {
            return "Múltiplo de ambos";
        } else if (multiploDe3) {
            return "Múltiplo de 3";
        } else if (multiploDe5) {
            return "Múltiplo de 5";
        } else {
            return "Não é múltiplo de 3 nem de 5";
        }
    }
}

public class Questao1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numeroInformado = scanner.nextInt();

        VerificadorMultiplos verificador = new VerificadorMultiplos(numeroInformado);

        String resultado = verificador.checar();

        System.out.println("Resultado: " + resultado);
        
        scanner.close();
    }
}