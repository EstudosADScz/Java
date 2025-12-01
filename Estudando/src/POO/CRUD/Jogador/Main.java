package POO.CRUD.Jogador;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        try{
            JogadorDAO dao = new JogadorDAO();

            dao.adicionarJogador(new Jogador("Carlos Silva", LocalDate.of(1995, 5, 20), "Flamengo", "Atacante", "123.456.789-00"));
            dao.adicionarJogador(new Jogador("Maria Santos", LocalDate.of(1998, 8, 15), "Palmeiras", "Meio-campo", "987.654.321-00"));
            System.out.println("Jogadores adicionados com sucesso!");

            System.out.println("\nLista de Jogadores:");
            for (Jogador jogador : dao.getJogadores()) {
                System.out.println(jogador);
            }

        } catch (Exception e) {
            System.err.println("Ocorreu um erro: " + e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("\nPrograma finalizado.");   
        }
    }
    
}
