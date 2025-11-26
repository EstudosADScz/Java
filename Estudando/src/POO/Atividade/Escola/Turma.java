public class Turma {
    public static void main(String[] args){
        Aluno[] turma = new Aluno[5];
        turma[0] = new Aluno("João", 1001L);
        turma[1] = new Aluno("Maria", 1002L);
        turma[2] = new Aluno("Pedro", 1003L);
        turma[3] = new Aluno("Ana", 1004L);
        turma[4] = new Aluno("Carlos", 1005L);
    
        turma[0].cadastrarNotas(8.5, 7.0, 9.0); 
        turma[1].cadastrarNotas(5.0, 6.5, 7.0); 
        turma[2].cadastrarNotas(4.0, 5.5, 6.0); 
        turma[3].cadastrarNotas(9.5, 8.8, 9.2); 
        turma[4].cadastrarNotas(7.0, 7.0, 7.0); 

        for (Aluno aluno : turma) {
            System.out.println("Aluno: " + aluno.getNome());
            System.out.println("Matrícula: " + aluno.getMatricula());
            System.out.printf("Média: %.2f\n", aluno.calcularMedia());
            if (aluno.verificarAprovacao()) {
                System.out.println("Status: Aprovado\n");
            } else {
                System.out.println("Status: Reprovado\n");
            }
        }
    }
    
}
