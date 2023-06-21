package SegurancaDeAutenticacao;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.HashMap;
import java.util.Map;

public class Autenticacao {
    private static Map<String, String> usuarios = new HashMap<>();

    public static void verificarAutenticacao(String usuario, String senha) {
        // Criar alguns usuários de exemplo
        adicionarUsuario("Raissa", "raissa123");
        adicionarUsuario("Ana Vitoria", "ana123");
        adicionarUsuario("Ana Tome", "tome123");


        if (autenticarUsuario(usuario, senha)) {
            System.out.println("Autenticação bem-sucedida! Bem-vindo, " + usuario + ".");
            // Realize as operações necessárias após o login bem-sucedido
        } else {
            System.out.println("Login ou senha inválido, acesso negado");
            // Tome as medidas apropriadas para lidar com a falha na autenticação
        }

    }
    private static void adicionarUsuario(String nomeUsuario, String senha) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String senhaCriptografada = encoder.encode(senha);
        usuarios.put(nomeUsuario, senhaCriptografada);
    }

    private static boolean autenticarUsuario(String nomeUsuario, String senha) {
        if (usuarios.containsKey(nomeUsuario)) {
            String senhaCriptografada = usuarios.get(nomeUsuario);
            BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
            return encoder.matches(senha, senhaCriptografada);
        }
        return false;
    }

}


