package poo.lucas.orientacaoaobjetos.classeabstrata;

public abstract class Animal {

    String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public void dormir() {
        System.out.println(nome + " está dormindo.");
    }

    public abstract void fazerSom();
}
