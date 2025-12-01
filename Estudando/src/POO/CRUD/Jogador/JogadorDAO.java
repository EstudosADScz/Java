package POO.CRUD.Jogador;

import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashSet;
import java.util.Set;

public class JogadorDAO {
    private File file;

    public JogadorDAO() throws IOException {
        file = new File("jogadores.txt");
        if(!file.exists()){
            file.createNewFile();
        }
    }

    @SuppressWarnings("unchecked")
    public Set<Jogador> getJogadores() throws IOException, ClassNotFoundException {
        if(file.length() == 0) return new HashSet<>();
        try (ObjectInputStream in = new ObjectInputStream(new java.io.FileInputStream(file))) {
            return (Set<Jogador>) in.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            return new HashSet<>();
        }
    }

    public boolean adicionarJogador(Jogador jogador) throws IOException, ClassNotFoundException {
        Set<Jogador> jogadores = getJogadores();
        boolean adicionou = jogadores.add(jogador);
        if (adicionou) atualizarArquivo(jogadores);
        return adicionou;
    }

    private void atualizarArquivo(Set<Jogador> jogadores) throws IOException {
        try (java.io.ObjectOutputStream out = new java.io.ObjectOutputStream(new java.io.FileOutputStream(file))) {
            out.writeObject(jogadores);
        }
    }
}
