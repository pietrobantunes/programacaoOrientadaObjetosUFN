package pkg;

public class PrincipalProduto {
	public static void main(String[] args) {
		Produto p1 = new Produto("Caneta", 1.5);
		Produto p2 = p1.aponta();
		
		System.out.println("P1: "+p1.getNome()+" - Preço: "+p1.getPreco());
		System.out.println("P2: "+p2.getNome()+" - Preço: "+p2.getPreco());
		
		p2.setPreco(2.33);

		System.out.println("P1: "+p1.getNome()+" - Preço: "+p1.getPreco());
		System.out.println("P2: "+p2.getNome()+" - Preço: "+p2.getPreco());
		
		p1.setPreco(5.0);
		
		System.out.println("P1: "+p1.getNome()+" - Preço: "+p1.getPreco());
		System.out.println("P2: "+p2.getNome()+" - Preço: "+p2.getPreco());
	}
}
