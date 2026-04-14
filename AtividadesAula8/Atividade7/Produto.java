package pkg.Atividade7; // Atividade similar a da Aula 6 - Atividade 1

public class Produto {
	public String nome;
	public int quantidade;
	public double preco;
	
	public Produto(String n, double p, int q) {
		nome = n;
				
        if (p < 0) {
            System.out.println("Preço inválido! Preço não pode ser negativo. Definindo preço como 0.");
            preco = 0;
        } else {
            preco = p;
        }

        if (q < 0) {
            System.out.println("Quantidade inválida! Quantidade não pode ser negativa. Definindo quantidade como 0.");
            quantidade = 0;
        } else {
            quantidade = q;
        }	
	}
	
    public double calcularValorTotal() {
        return preco * quantidade;
    }
    
    public void exibirInformacoes() {
    	System.out.println("\nNome: "+nome+"");
    	System.out.println("Preço: "+preco+"");
    	System.out.println("Quantidade: "+quantidade+"");
    }
}
