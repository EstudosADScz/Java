package POO.Superclasse.Pessoa;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // --- Criando e populando Aluno 1 ---
        Aluno aluno1 = new Aluno();
        aluno1.setName("João da Silva");
        aluno1.setMatricula(20230101L);
        aluno1.setDataNascimento(LocalDate.of(2005, 5, 15));
        aluno1.setSexo('M');
        aluno1.setTurma("3A");
        aluno1.setCurso("Ensino Médio Integrado em Informática");

        // --- Criando e populando Aluno 2 ---
        Aluno aluno2 = new Aluno();
        aluno2.setName("Maria Oliveira");
        aluno2.setMatricula(20230102L);
        aluno2.setDataNascimento(LocalDate.of(2006, 8, 22));
        aluno2.setSexo('F');
        aluno2.setTurma("3B");
        aluno2.setCurso("Ensino Médio Integrado em Edificações");

        // --- Criando e populando Professor 1 ---
        Professor prof1 = new Professor();
        prof1.setName("Carlos Pereira");
        prof1.setMatricula(98765L);
        prof1.setDataNascimento(LocalDate.of(1980, 10, 3));
        prof1.setSexo('M');
        prof1.setDisciplina("Programação Orientada a Objetos");
        prof1.setCargo("Professor");
        prof1.setSalario(7500.00);
        prof1.setDataAdmissao(LocalDate.of(2010, 3, 1));

        // --- Criando e populando Professor 2 ---
        Professor prof2 = new Professor();
        prof2.setName("Ana Souza");
        prof2.setMatricula(98766L);
        prof2.setDataNascimento(LocalDate.of(1985, 1, 25));
        prof2.setSexo('F');
        prof2.setDisciplina("Banco de Dados");
        prof2.setCargo("Professor");
        prof2.setSalario(8200.50);
        prof2.setDataAdmissao(LocalDate.of(2015, 8, 10));

        // --- Criando e populando um Funcionário ---
        Funcionario func1 = new Funcionario();
        func1.setName("José Santos");
        func1.setMatricula(10101L);
        func1.setDataNascimento(LocalDate.of(1990, 12, 1));
        func1.setSexo('M');
        func1.setCargo("Secretário Acadêmico");
        func1.setSalario(3250.75);
        func1.setDataAdmissao(LocalDate.of(2018, 2, 20));

        // --- Exibindo os dados de todos ---

        System.out.println("\n--- Dados do Aluno 1 ---");
        System.out.println(aluno1);

        System.out.println("\n--- Dados do Aluno 2 ---");
        System.out.println(aluno2);

        System.out.println("\n--- Dados do Professor 1 ---");
        System.out.println(prof1);

        System.out.println("\n--- Dados do Professor 2 ---");
        System.out.println(prof2);

        System.out.println("\n--- Dados do Funcionário 1 ---");
        System.out.println(func1);
    }
}
