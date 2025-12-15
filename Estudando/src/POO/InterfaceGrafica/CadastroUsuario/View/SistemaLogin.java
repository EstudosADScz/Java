package POO.InterfaceGrafica.CadastroUsuario.View;

import javax.swing.*;

import POO.InterfaceGrafica.CadastroUsuario.Exception.*;
import POO.InterfaceGrafica.CadastroUsuario.Model.Usuario;
import POO.InterfaceGrafica.CadastroUsuario.Service.UsuarioService;

import java.awt.*;

public class SistemaLogin {
    
    private UsuarioService service = new UsuarioService();

    // Método principal para iniciar o programa
    public static void main(String[] args) {
        new SistemaLogin().exibirTelaLogin();
    }

    // --- TELA 1: LOGIN ---
    public void exibirTelaLogin() {
        JFrame frame = new JFrame("Login");
        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(4, 1, 10, 10)); // Layout de grade

        JTextField txtEmail = new JTextField();
        txtEmail.setBorder(BorderFactory.createTitledBorder("E-mail"));
        
        JPasswordField txtSenha = new JPasswordField();
        txtSenha.setBorder(BorderFactory.createTitledBorder("Senha"));

    
        JButton btnEntrar = new JButton("Entrar");
        JButton btnCriarConta = new JButton("Não tenho conta (Cadastrar)");

        // AÇÃO DO BOTÃO ENTRAR
        btnEntrar.addActionListener(e -> {
            try {
                String email = txtEmail.getText();
                String senha = new String(txtSenha.getPassword());

                // Chama o Service
                Usuario user = service.logar(email, senha);
                
                // Se passar, fecha login e abre principal
                JOptionPane.showMessageDialog(frame, "Login realizado com sucesso!");
                frame.dispose(); // Fecha a janela atual
                exibirTelaPrincipal(user);

            } catch (UsuarioNaoCadastradoException | SenhaInvalidaException ex) {
                // Captura as exceções personalizadas
                JOptionPane.showMessageDialog(frame, "Erro: " + ex.getMessage(), "Atenção", JOptionPane.ERROR_MESSAGE);
            }
        });

        // AÇÃO DO BOTÃO CADASTRAR
        btnCriarConta.addActionListener(e -> {
            frame.dispose(); // Fecha login
            exibirTelaCadastro(); // Abre cadastro
        });

        frame.add(txtEmail);
        frame.add(txtSenha);
        frame.add(btnEntrar);
        frame.add(btnCriarConta);
        frame.setLocationRelativeTo(null); // Centraliza na tela
        frame.setVisible(true);
    }

    // --- TELA 2: CADASTRO ---
    public void exibirTelaCadastro() {
        JFrame frame = new JFrame("Nova Conta");
        frame.setSize(300, 300);
        frame.setLayout(new GridLayout(5, 1, 10, 10));

        JTextField txtNome = new JTextField();
        txtNome.setBorder(BorderFactory.createTitledBorder("Nome Completo"));

        JTextField txtEmail = new JTextField();
        txtEmail.setBorder(BorderFactory.createTitledBorder("E-mail"));

        JPasswordField txtSenha = new JPasswordField();
        txtSenha.setBorder(BorderFactory.createTitledBorder("Senha"));

        JButton btnSalvar = new JButton("Salvar Cadastro");
        JButton btnVoltar = new JButton("Voltar");

        btnSalvar.addActionListener(e -> {
            try {
                service.cadastrar(txtNome.getText(), txtEmail.getText(), new String(txtSenha.getPassword()));
                JOptionPane.showMessageDialog(frame, "Conta criada! Faça login agora.");
                frame.dispose();
                exibirTelaLogin(); // Volta pro login
            } catch (EmailInvalidoException ex) {
                JOptionPane.showMessageDialog(frame, ex.getMessage(), "Erro no Email", JOptionPane.WARNING_MESSAGE);
            }
        });

        btnVoltar.addActionListener(e -> {
            frame.dispose();
            exibirTelaLogin();
        });

        frame.add(txtNome);
        frame.add(txtEmail);
        frame.add(txtSenha);
        frame.add(btnSalvar);
        frame.add(btnVoltar);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    // --- TELA 3: PRINCIPAL (Pós-Login) ---
    public void exibirTelaPrincipal(Usuario usuario) {
        JFrame frame = new JFrame("Sistema Principal");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JLabel labelBoasVindas = new JLabel("Bem-vindo, " + usuario.getNome() + "!", SwingConstants.CENTER);
        labelBoasVindas.setFont(new Font("Arial", Font.BOLD, 20));

        JButton btnSair = new JButton("Sair / Logout");
        btnSair.addActionListener(e -> {
            frame.dispose();
            exibirTelaLogin();
        });

        frame.add(labelBoasVindas, BorderLayout.CENTER);
        frame.add(btnSair, BorderLayout.SOUTH);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}