package POO.InterfaceGrafica.CadastroUsuario.Exception;

public class UsuarioNaoCadastradoException extends Exception {
    public UsuarioNaoCadastradoException() {
        super("Usuário não encontrado! Faça o cadastro primeiro.");
    }
}