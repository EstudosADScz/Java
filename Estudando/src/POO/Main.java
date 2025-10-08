package POO;

import java.time.LocalDate;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Aluno joao = new Aluno();

        System.out.println("Informe seu nome: ");
        joao.setName(sc.nextLine());

        System.out.println("Informe sua matricula: ");
        joao.setMatricula(sc.nextLong());

        System.out.println("Informe sua data de nascimento: ");
        joao.setDataNascimento(LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println("Informe sua turma: ");
        joao.setTurma(sc.next());

        System.out.println("Informe seu sexo: ");
        joao.setSexo(sc.next().charAt(0));

        System.out.println("Nome: " + joao.getName());
        System.out.println("Matricula: " + joao.getMatricula());
        System.out.println("Data de nascimento: " + joao.getDataNascimento());
        System.out.println("Turma: " + joao.getTurma());
        System.out.println("Sexo: " + joao.getSexo());  
       
        }
    
}
