package POO.CRUD.Jogador;

import java.util.HashSet;
import java.util.Set;

public class JogadorDAO {
    Set<Jogador> jogadores;

    public JogadorDAO() {
        jogadores = new HashSet<>();
    }
    
    public boolean adicionarJogador(Jogador jogador) {
        return jogadores.add(jogador);
    }
    
    public boolean verificarJogador(Jogador jogador) {
        return jogadores.contains(jogador);
    }

    public boolean removerJogador(Jogador jogador) {
        return jogadores.remove(jogador);
    }

    public boolean atualizarJogador(Jogador jogador) {
        return jogadores.remove(jogador) && jogadores.add(jogador);
    }

    public Set<Jogador> listarJogadores() {
        return jogadores;
    }


    
}
