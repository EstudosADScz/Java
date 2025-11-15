package POO.Interfaces.RelatorioFinanceiro;

class Contrato implements Imprimivel {
    private String termos;

    public Contrato(String termos) {
        this.termos = termos;
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo Contrato: " + this.termos);
    }
    
    public String getTermos() { return this.termos; }
}