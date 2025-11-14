package POO.Escola;

import java.time.LocalDate;

public class Aluno extends Pessoa {
    private String turma;
    private String curso;

    public Aluno(long matricula, String name, LocalDate dataNascimento, String turma, String curso, char sexo){
        super(matricula, name, dataNascimento, sexo);
        this.turma = turma;
        this.curso = curso;
    }
    
    public Aluno(){
        super();
    }
        
    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Turma: " + turma + "\n" +
               "Curso: " + curso;
    }
}
