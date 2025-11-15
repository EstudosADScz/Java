package POO.Superclasse.Pessoa;

import java.time.LocalDate;
 
public class Professor extends Funcionario { // Funcionario está no mesmo pacote
    private String disciplina;
 
    public Professor(long matricula, String name, LocalDate dataNascimento, char sexo, double salario, LocalDate dataAdmissao, String disciplina) {
        // O cargo é fixo como "Professor"
        super(matricula, name, dataNascimento, sexo, "Professor", salario, dataAdmissao);
        this.disciplina = disciplina;
    }

    public Professor() {
        super();
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Disciplina: " + disciplina;
    }
}
