public class Aluno{
    private String nome;
    private Long matricula;
    private double[] nota;

    public Aluno(String nome, Long matricula){
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Long getMatricula(){
        return matricula;
    }

    public void setMatricula(Long matricula){
        this.matricula = matricula;
    }

    public double[] getNota(){
        return nota;
    }

    public void setNota(double[] nota){
        this.nota = nota;
    }

    public void cadastrarNotas(double nota1, double nota2, double nota3){
        nota = new double[3];
        nota[0] = nota1;
        nota[1] = nota2;
        nota[2] = nota3;
    }

    public double calcularMedia(){
        double soma = 0;
        if (nota == null || nota.length == 0) {
            return 0.0;
        }
        for (double n : nota) {
            soma += n;
        }
        return soma / nota.length;
    }
     
    
    public boolean verificarAprovacao(){
        return calcularMedia() >= 7;
    }

}