package pkg.Atividade1;

public class Produto {
    public String nome;
    public float preco;
    public int quantidade;

    public Produto(String n, float p, int q) {

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

    public float calcularValorTotalEstoque() {
        return preco * quantidade;
    }

    public boolean temEstoque() {
        return quantidade > 0;
    }

    public int adicionarEstoque(int quantidade) {
        if (quantidade < 0) {
            System.out.println("Erro: Não é permitido adicionar quantidades negativas.");
            return this.quantidade;
        }

        this.quantidade += quantidade;
        return this.quantidade;
    }

    public boolean vender(int quantidade) {
        if (quantidade < 0) {
            System.out.println("Erro: Não é permitido vender quantidades negativas.");
            return true;
        }

        if (this.quantidade >= quantidade) {
            this.quantidade -= quantidade;
            return true;
        } else {
            return false;
        }
    }
}