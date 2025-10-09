import java.util.Locale;
import java.util.Scanner;

class Aluno {
    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;

    public Aluno(String nome, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double calcularMediaPonderada() {
        return (this.nota1 + this.nota2 + (this.nota3 * 2)) / 4.0;
    }

    public String getSituacao() {
        if (this.calcularMediaPonderada() >= 7.0) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    public String getNome() {
        return this.nome;
    }
}

public class Questao2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a primeira nota: ");
        double n1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double n2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota (com peso 2): ");
        double n3 = scanner.nextDouble();

        Aluno aluno = new Aluno(nome, n1, n2, n3);

        double media = aluno.calcularMediaPonderada();
        String situacao = aluno.getSituacao();

        System.out.println("\n--- Resultado ---");
        System.out.println("Aluno: " + aluno.getNome());
        System.out.printf("Média Ponderada: %.2f\n", media);
        System.out.println("Situação: " + situacao);
        
        scanner.close();
    }
}