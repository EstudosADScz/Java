package POO.Interfaces.RelatorioFinanceiro;

public class RelatorioFinanceiro implements Imprimivel, EnviavelPorEmail {
    private String dados;

    public RelatorioFinanceiro(String dados) {
        this.dados = dados;
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo Relatório Financeiro: " + this.dados);
    }

    @Override
    public void enviar(String email) {
        System.out.println("Enviando Relatório Financeiro para " + email + ": " + this.dados);
    }
    
    public String getDados() { return this.dados; }
}
