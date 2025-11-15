package POO.Superclasse.Pessoa;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Funcionario extends Pessoa {
    private String cargo;
    private double salario;
    private LocalDate dataAdmissao;

    public Funcionario(long matricula, String name, LocalDate dataNascimento, char sexo, String cargo, double salario, LocalDate dataAdmissao) {
        super(matricula, name, dataNascimento, sexo);
        this.cargo = cargo;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
    }

    public Funcionario() {
        super();
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return super.toString() + "\n" +
               "Cargo: " + cargo + "\n" +
               String.format("Salário: R$ %.2f", salario) + "\n" +
               "Data de Admissão: " + dataAdmissao.format(formatter);
    }
}
