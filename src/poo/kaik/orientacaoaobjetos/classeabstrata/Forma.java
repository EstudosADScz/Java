package poo.lucas.orientacaoaobjetos.classeabstrata;

public abstract class Forma {

    private String cor;

    public Forma(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return this.cor;
    }

    public abstract double calcularArea();
}
