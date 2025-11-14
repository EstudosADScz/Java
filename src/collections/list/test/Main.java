package collections.list.test;

import collections.list.models.Aluno;
import collections.list.models.Professor;
import collections.list.models.Turma;

public class Main {

    static void main() {

        Professor professor = new Professor("124.123.456-90", "Paulo", 8000);
        Turma turma = new Turma(professor, "POO");

        turma.matricular(new Aluno("222.222.222-02", "Maria", 202412010040l));
        turma.matricular(new Aluno("333.333.333-03", "Pedro", 202412010030l));
        System.out.println(turma.getAlunos());

        //Ele só remove recebendo os mesmos parâmetros de Maria pq eu sobrescrevi o equals e hash code na classe Aluno
        turma.trancar(new Aluno("222.222.222-02", "Maria", 202412010040l));
        
        System.out.println(turma.getAlunos());
    }
}
