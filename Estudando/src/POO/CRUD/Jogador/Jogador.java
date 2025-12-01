package POO.CRUD.Jogador;

import java.io.Serializable;
import java.time.LocalDate;

public class Jogador implements Serializable {
    private String name;
    private LocalDate nascimento;
    private String time;
    private String position;
    private String cpf;

    public Jogador(String name, LocalDate nascimento, String time, String position, String cpf) {
        this.name = name;
        this.nascimento = nascimento;
        this.time = time;
        this.position = position;
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Jogador{" +
               "name='" + name + '\'' +
               ", nascimento=" + nascimento +
               ", time='" + time + '\'' +
               ", position='" + position + '\'' +
               ", cpf='" + cpf + '\'' +
               '}';
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Jogador jogador = (Jogador) obj;
        return cpf.equals(jogador.cpf);
    }

    @Override
    public int hashCode() {
        return cpf.hashCode();
    }
}
