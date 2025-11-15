package POO.Interfaces.Smartphone;

public class Smartphone implements AparelhoEletronico, ReprodutorMusical, NavegadorInternet {

    @Override
    public void ligar() {
        System.out.println("Ligando o smartphone...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void tocar() {
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música na playlist.");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página da web.");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no navegador.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página da web.");
    }

    public void usarSmartphone() {
        System.out.println("\n--- Usando o Smartphone ---");
        ligar();
        atender();
        tocar();
        selecionarMusica();
        pausar();
        exibirPagina();
        adicionarNovaAba();
        atualizarPagina();
        System.out.println("--- Fim do uso do Smartphone ---\n");
    }
}

