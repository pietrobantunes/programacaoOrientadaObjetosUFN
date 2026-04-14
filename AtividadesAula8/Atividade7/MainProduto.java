package pkg.Atividade7;

import java.util.Scanner;

public class MainProduto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome = null;
		double preco = 0;
		int quantidade = 0;
		
		// Produto 1
		Produto Produto1 = new Produto("Notebook", 3000, 6);
		
		// Produto 2
	    System.out.println("CADASTRAR PRODUTO");

        System.out.println("Nome:");
        nome = sc.nextLine();

        System.out.println("Preço (R$):");
        preco = sc.nextDouble();

        System.out.println("Quantidade:");
        quantidade = sc.nextInt();
        
		Produto Produto2 = new Produto(nome, preco, quantidade);
		
		// Execução métodos
		Produto1.exibirInformacoes();
		System.out.println("Valor total em estoque: "+Produto1.calcularValorTotal()+"");	
		
		Produto2.exibirInformacoes();
		System.out.println("Valor total em estoque: "+Produto2.calcularValorTotal()+"");
		
		sc.close();
	}
}
