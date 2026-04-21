package pkg.Atividade6;

import java.util.Scanner;

public class MainPessoa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Pessoa p = new Pessoa();

        System.out.print("Nome: ");
        p.setNome(sc.nextLine());

        System.out.print("Idade: ");
        p.setIdade(sc.nextInt());

        sc.nextLine();

        System.out.print("CPF: ");
        p.setCpf(sc.nextLine());

        System.out.println("Maior de idade: " + p.verificaMaiorDeIdade());

        sc.close();
    }
}