package SegurancaDeAutenticacao;

import java.util.HashMap;
import java.util.Map;

public class Autenticacao {
    private static Map<String, String> usuarios = new HashMap<>();

    public static void verificarAutenticacao(String usuario, String senha) {
        // Criar alguns usuários de exemplo
        usuarios.put("Raissa", "raissa123");
        usuarios.put("Ana Vitoria", "ana123");
        usuarios.put("Ana Tome", "tome123");

        if (autenticarUsuario(usuario, senha)) {
            System.out.println("Autenticação bem-sucedida! Bem-vindo, " + usuario + ".");
            // Realize as operações necessárias após o login bem-sucedido
        } else {
            System.out.println("Login ou senha inválido, acesso negado");
            // Tome as medidas apropriadas para lidar com a falha na autenticação
        }

    }

    private static boolean autenticarUsuario(String usuario, String senha) {
        if (usuarios.containsKey(usuario)) {
            String senhaArmazenada = usuarios.get(usuario);
            return senha.equals(senhaArmazenada);
        }
        return false;
    }

}


