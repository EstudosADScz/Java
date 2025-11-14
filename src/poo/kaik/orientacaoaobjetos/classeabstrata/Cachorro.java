package poo.lucas.orientacaoaobjetos.classeabstrata;

public class Cachorro extends Animal {

    public Cachorro(String nome) { super(nome); }

    @Override
    public void fazerSom() {
        System.out.println("Au au!");
    }
}
