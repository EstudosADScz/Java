package POO.Superclasse.Pessoa;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;


public class Pessoa {
    // Formatter para ser usado pelas subclasses no toString()
    private long matricula;
    private String name;
    private LocalDate dataNascimento;
    private char sexo;

    public Pessoa(long matricula, String name, LocalDate dataNascimento, char sexo) {
        this.matricula = matricula;
        this.name = name;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
    }

    public Pessoa() {
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Nome: " + name + "\n" +
               "Matrícula: " + matricula + "\n" +
               "Data de Nascimento: " + dataNascimento.format(formatter) + "\n" +
               "Sexo: " + sexo;
    }
}
