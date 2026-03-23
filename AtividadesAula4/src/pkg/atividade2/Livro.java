package pkg.atividade2;

public class Livro {
    private String titulo;
    private String autor;
    private int ano;
    private String genero;
    private boolean emprestado;

    public Livro(String titulo, String autor, int ano, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.genero = genero;
        this.emprestado = false;
    }

    public String info() {
        return "Título: " + titulo +
               "\nAutor: " + autor +
               "\nAno: " + ano +
               "\nGênero: " + genero +
               "\nEmprestado: " + (emprestado ? "Sim" : "Não");
    }

    public void emprestar() {
        if (!emprestado) {
            emprestado = true;
            System.out.println("Livro emprestado com sucesso!");
        } else {
            System.out.println("O livro já está emprestado!");
        }
    }

    public void devolver() {
        if (emprestado) {
            emprestado = false;
            System.out.println("Livro devolvido com sucesso!");
        } else {
            System.out.println("O livro não está emprestado!");
        }
    }
}