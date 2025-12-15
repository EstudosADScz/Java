package POO.InterfaceGrafica.CadastroUsuario.Exception;

public class EmailInvalidoException extends Exception {
    public EmailInvalidoException() {
        super("Formato de e-mail inválido! (deve conter '@' e '.')");
    }
}