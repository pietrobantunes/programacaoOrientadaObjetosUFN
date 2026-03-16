package pkg.Atividade5;

import java.util.Scanner;

public class AppProduto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Produto p = new Produto();

        System.out.print("Nome: ");
        p.nome = sc.nextLine();
        System.out.print("Preço: ");
        p.preco = sc.nextDouble();
        System.out.print("Quantidade: ");
        p.quantidade = sc.nextInt();

        double total = p.preco * p.quantidade;

        System.out.println("\nProduto:");
        System.out.println(p.nome + " - R$" + p.preco + " - Quantidade: " + p.quantidade);
        System.out.println("Total em estoque: R$" + total);
        
        sc.close();
    }
}
