package pkg.Atividade9;

public class MainLivro {
    public static void main(String[] args) {

        Livro l = new Livro("Livro", "Autor", 200);

        System.out.println(l.detalhesLivro());

        System.out.println("Disponivel: " + l.estaDisponivel());

        if (l.emprestar()) {
            System.out.println("Livro emprestado!");
        }

        System.out.println("Disponivel após emprestar? " + l.estaDisponivel());

        l.devolver();

        System.out.println("Disponivel após devolver? " + l.estaDisponivel());
    }
}