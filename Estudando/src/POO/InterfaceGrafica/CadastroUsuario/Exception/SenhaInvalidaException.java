package POO.InterfaceGrafica.CadastroUsuario.Exception;

public class SenhaInvalidaException extends Exception {
    public SenhaInvalidaException() {
        super("Senha incorreta! Tente novamente.");
    }
}