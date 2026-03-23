package pkg.atividade5;

import java.util.Scanner;

public class MainPessoaConstrutor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 1 para usar o construtor (nome + idade)");
        System.out.println("Digite 2 para usar o construtor (idade):");
        int op = sc.nextInt();

        if (op == 1) {
            System.out.println("Digite o nome:");
            String nome = sc.next();
            System.out.println("Digite a idade:");
            int idade = sc.nextInt();
            new PessoaConstrutor(nome, idade);
        } else {
            System.out.println("Digite a idade:");
            int idade = sc.nextInt();
            new PessoaConstrutor(idade);
        }

        sc.close();
    }
}