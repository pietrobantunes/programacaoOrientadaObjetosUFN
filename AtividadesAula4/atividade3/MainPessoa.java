package pkg.atividade3;

import java.util.Scanner;

public class MainPessoa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Pessoa 1");
        System.out.println("Nome:");
        String n1 = sc.nextLine();
        System.out.println("Email:");
        String e1 = sc.nextLine();
        System.out.println("Data de nascimento:");
        String d1 = sc.nextLine();
        System.out.println("Endereço:");
        String end1 = sc.nextLine();

        Pessoa p1 = new Pessoa(n1, e1, d1, end1, true);

        System.out.println("\nPessoa 2");
        System.out.println("Nome:");
        String n2 = sc.nextLine();
        System.out.println("Email:");
        String e2 = sc.nextLine();
        System.out.println("Data de nascimento:");
        String d2 = sc.nextLine();
        System.out.println("Endereço:");
        String end2 = sc.nextLine();

        Pessoa p2 = new Pessoa(n2, e2, d2, end2, false);

        sc.close();

        System.out.println("Admin: " + p1.getEmail());
        System.out.println("Não admin: " + p2.getEmail());
    }
}