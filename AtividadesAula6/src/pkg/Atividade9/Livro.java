package pkg.Atividade9;

public class Livro {
    public String titulo;
    public String autor;
    public int paginas;
    public boolean emprestado;

    public Livro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.emprestado = false;
    }

    public boolean emprestar() {
        if (!emprestado) {
            emprestado = true;
            return true;
        }
        return false;
    }

    public void devolver() {
        emprestado = false;
    }

    public boolean estaDisponivel() {
        return !emprestado;
    }

    public String detalhesLivro() {
        return titulo + " - " + autor;
    }
}