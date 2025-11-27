package POO.Exceptions.Banco;

public class ContaCorrente {
    private int numero;
    private String titular;
    private double saldo;
    private double limiteSaque;

    public ContaCorrente(int numero, String titular, double saldo, double limiteSaque) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.limiteSaque = limiteSaque;
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    } 

    public void sacar(double valor) throws SaldoInsuficienteException, LimiteExcedidoException {
        if (valor > this.limiteSaque) {
            throw new LimiteExcedidoException("O valor do saque excede o seu limite de R$" + this.limiteSaque);
        }

        if (valor > this.saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente. Saldo atual: R$" + this.saldo);
        }

        this.saldo -= valor;
    }
    
}
