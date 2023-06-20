package SegurancaDeAutorizacao;

import java.util.ArrayList;
import java.util.List;

public class Autorizacao {
    private static List<String> usuariosAutorizados = new ArrayList<>();

    public static void autorzacaoParaEditarDados(String usuario) {
        // Criar alguns usuários de exemplo
        usuariosAutorizados.add("Ana Tome");

        if (verificarAutorizacao(usuario)) {
            System.out.println(usuario + " você é autorizada(o) a editar dados!");
            // Realize as operações necessárias após o login bem-sucedido
        } else {
            System.out.println(usuario + " você não é autorizada(o) a editar dados!");
            // Tome as medidas apropriadas para lidar com a falha na autenticação
        }
    }
    public static void autorzacaoParaEnviarMensagem(String usuario) {
        // Criar alguns usuários de exemplo
        usuariosAutorizados.add("Raissa");
        usuariosAutorizados.add("Ana Vitoria");

        if (verificarAutorizacao(usuario)) {
            System.out.println(usuario + " você é autorizada(o) a enviar mensagens!");
            // Realize as operações necessárias após o login bem-sucedido
        } else {
            System.out.println(usuario + " você não é autorizada(o) a enviar mensagens");
            // Tome as medidas apropriadas para lidar com a falha na autenticação
        }
    }

    private static boolean verificarAutorizacao(String usuario) {
        return usuariosAutorizados.contains(usuario);
    }
}


