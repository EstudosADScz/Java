package POO.CRUD.Jogador;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        JogadorDAO jogadorDAO = new JogadorDAO();

        Jogador jogador1 = new Jogador("João", LocalDate.of(1990, 1, 1), "Time A", "Atacante", "12345678901");
        Jogador jogador2 = new Jogador("Lukinhas", LocalDate.of(1992, 2, 2), "Time B", "Defensor", "10987654321");
        
        jogadorDAO.adicionarJogador(jogador1);        
        jogadorDAO.adicionarJogador(jogador2);

        System.out.println("Jogadores após adição:");
        for (Jogador jogador : jogadorDAO.listarJogadores()) {
            System.out.println(jogador);
        }

        jogador1.setPosition("Meio-campo");
        jogadorDAO.atualizarJogador(jogador1);

        System.out.println("\nJogadores após atualização:");
        for (Jogador jogador : jogadorDAO.listarJogadores()) {
            System.out.println(jogador);
        }

        jogadorDAO.removerJogador(jogador2);

        System.out.println("\nJogadores após remoção:");
        for (Jogador jogador : jogadorDAO.listarJogadores()) {
            System.out.println(jogador);
        }
        
    }
    
}
