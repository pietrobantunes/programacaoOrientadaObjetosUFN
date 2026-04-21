package pkg.Atividade8;

import java.util.Scanner;

public class MainUsuario {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Usuario u = new Usuario("admin", "1234");

        System.out.print("Digite o usuario: ");
        String user = sc.nextLine();

        System.out.print("Digite a senha: ");
        String senha = sc.nextLine();

        if (u.login(user, senha)) {
            System.out.println("Login realizado com sucesso!");
        } else {
            System.out.println("Login inválido!");
        }

        u.exibirStatus();

        System.out.print("Deseja fazer logout? (s/n): ");
        String op = sc.nextLine();

        if (op.equalsIgnoreCase("s")) {
            u.logout();
        }

        u.exibirStatus();

        sc.close();
    }
}