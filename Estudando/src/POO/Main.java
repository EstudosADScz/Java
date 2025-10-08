package POO;

import java.time.LocalDate;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1. Crie o formatador para ser reutilizado
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        Aluno joao = new Aluno();

        System.out.println("Informe seu nome: ");
        joao.setName(sc.nextLine());

        System.out.println("Informe sua matricula: ");
        joao.setMatricula(Long.parseLong(sc.nextLine())); // Boa prática: Evita problemas com o Scanner

        System.out.println("Informe sua data de nascimento (dd/mm/aaaa): ");
        joao.setDataNascimento(LocalDate.parse(sc.nextLine(), formatter));

        System.out.println("Informe sua turma: ");
        joao.setTurma(sc.nextLine());

        System.out.println("Informe seu sexo (M/F): ");
        joao.setSexo(sc.nextLine().charAt(0));

        System.out.println("\n--- Dados do Aluno ---");
        System.out.println("Nome: " + joao.getName());
        System.out.println("Matricula: " + joao.getMatricula());
        
        System.out.println("Data de nascimento: " + joao.getDataNascimento().format(formatter));
        System.out.println("Turma: " + joao.getTurma());
        System.out.println("Sexo: " + joao.getSexo());  
        
        sc.close();
    }
}
