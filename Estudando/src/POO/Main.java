package POO;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Aluno joao = new Aluno(98567, "João da Silva", LocalDate.of(1985, 6, 18), "ADS", 'M');
       
        System.out.println("Matrícula: " + joao.getMatricula());
        System.out.println("Nome: " + joao.getName());
        System.out.println("Data Nascimento: " + joao.getDataNascimento());
        System.out.println("Turma: " + joao.getTurma());
        System.out.println("Sexo: " + joao.getSexo());

        
        Aluno maria = new Aluno(12345L, "Maria Oliveira", LocalDate.of(1992, 3, 12), "BD", 'F');
        System.out.println();
        System.out.println("Matrícula: " + maria.getMatricula());
        System.out.println("Nome: " + maria.getName());
        System.out.println("Data Nascimento: " + maria.getDataNascimento());
        System.out.println("Turma: " + maria.getTurma());
        System.out.println("Sexo: " + maria.getSexo());
        }
    
}
