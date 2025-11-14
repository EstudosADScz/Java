package collections.list.models;

import java.util.ArrayList;
import java.util.List;

public class Turma {

    private Professor professor;
    private List<Aluno> alunos;
    private String disciplina;

    public Turma(Professor professor, String disciplina) {
        this.professor = professor;
        alunos = new ArrayList<>();
        this.disciplina = disciplina;
    }

    public boolean matricular(Aluno aluno) {
        if(alunos.contains(aluno)) return false;
        return alunos.add(aluno);
    }

    public boolean trancar(Aluno aluno) {
        return alunos.remove(aluno);
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

}
