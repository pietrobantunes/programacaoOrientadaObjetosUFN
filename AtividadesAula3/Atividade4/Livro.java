package pkg.Atividade4;

public class Livro {
    public String titulo;
    public String autor;
    public int ano;

    public static void main(String[] args) {
        Livro l = new Livro();
        l.titulo = "Título";
        l.autor = "Autor";
        l.ano = 2000;

        System.out.println(l.titulo + " - " + l.autor + " - " + l.ano);
    }
}
