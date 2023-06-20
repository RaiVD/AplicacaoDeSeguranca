package SegurancaDeAutenticacao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean encerrar = false;
        while (!encerrar) {
            System.out.println("======  MENU  ======");
            System.out.println("1. Login");
            System.out.println("2. Sair");
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1 -> {
                    System.out.println("Digite o nome de usuário: ");
                    scanner.nextLine();
                    String usuario = scanner.nextLine();
                    System.out.println("Digite a senha: ");
                    String senha = scanner.nextLine();
                    Autenticacao.verificarAutenticacao(usuario,senha);
                }
                case 2 -> encerrar = true;
            }
        }
    }
}