package SegurancaDeAutorizacao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean encerrar = false;
        while (!encerrar) {
            System.out.println("======  MENU  ======");
            System.out.println("1. Editar dados pessoais");
            System.out.println("2. Enviar mensagem");
            System.out.println("3. Encerrar");
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1 -> {
                    System.out.println("Digite o nome de usuário: ");
                    scanner.nextLine();
                    String usuario = scanner.nextLine();
                    Autorizacao.autorzacaoParaEditarDados(usuario);
                }
                case 2 -> {
                    System.out.println("Digite o nome de usuário: ");
                    scanner.nextLine();
                    String usuario = scanner.nextLine();
                    Autorizacao.autorzacaoParaEnviarMensagem(usuario);
                }
                case 3 -> encerrar = true;
            }
        }
    }
}