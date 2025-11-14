package collections.list.models;

import java.util.Objects;

public class Aluno {

    private String cpf;
    private String nome;
    private long matricula;

    public Aluno(String cpf, String nome, long matricula) {
        this.cpf = cpf;
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return matricula == aluno.matricula && Objects.equals(cpf, aluno.cpf) && Objects.equals(nome, aluno.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf, nome, matricula);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", matricula=" + matricula +
                '}';
    }

}
