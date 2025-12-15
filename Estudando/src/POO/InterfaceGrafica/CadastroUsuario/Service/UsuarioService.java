package POO.InterfaceGrafica.CadastroUsuario.Service;
import java.util.ArrayList;
import java.util.List;

import POO.InterfaceGrafica.CadastroUsuario.Exception.*;
import POO.InterfaceGrafica.CadastroUsuario.Model.Usuario;


public class UsuarioService {
    
    // Simula o banco de dados
    private static List<Usuario> bancoDeDados = new ArrayList<>();

    public void cadastrar(String nome, String email, String senha) throws EmailInvalidoException {
        // Validação 1: Email Inválido
        if (!email.contains("@") || !email.contains(".")) {
            throw new EmailInvalidoException();
        }
        
        Usuario novoUser = new Usuario(nome, email, senha);
        bancoDeDados.add(novoUser);
    }

    public Usuario logar(String email, String senha) throws UsuarioNaoCadastradoException, SenhaInvalidaException {
        // Busca o usuário na lista (Java Stream seria mais chique, mas vamos usar 'for' clássico pra facilitar)
        Usuario usuarioEncontrado = null;
        
        for (Usuario u : bancoDeDados) {
            if (u.getEmail().equals(email)) {
                usuarioEncontrado = u;
                break;
            }
        }

        // Validação 2: Não Cadastrado
        if (usuarioEncontrado == null) {
            throw new UsuarioNaoCadastradoException();
        }

        // Validação 3: Senha Inválida
        if (!usuarioEncontrado.getSenha().equals(senha)) {
            throw new SenhaInvalidaException();
        }

        return usuarioEncontrado;
    }
}
