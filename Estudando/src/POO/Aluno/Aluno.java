package POO.Aluno;

import java.time.LocalDate;

public class Aluno {
    private long matricula;
    private String name;
    private LocalDate dataNascimento;
    private String turma;
    private char sexo;

    /*public Aluno(long matricula, String name, LocalDate dataNascimento, String turma, char sexo){

        this.matricula = matricula;
        this.name = name;
        this.dataNascimento = dataNascimento;
        this.turma = turma;
        this.sexo = sexo;

    }
    */
        
   public long getMatricula() {
       return matricula;
   }

   public void setMatricula(long matricula) {
       this.matricula = matricula;
   }

   public String getName(){
    return name;
   }

   public void setName(String name){
    this.name = name;
   }

   public LocalDate getDataNascimento() {
       return dataNascimento;
   }

   public void setDataNascimento(LocalDate dataNascimento) {
       this.dataNascimento = dataNascimento;
   }

   public String getTurma() {
       return turma;
   }

   public void setTurma(String turma) {
       this.turma = turma;
   }

   public char getSexo() {
       return sexo;
   }

   public void setSexo(char sexo) {
       this.sexo = sexo;
   }

}
