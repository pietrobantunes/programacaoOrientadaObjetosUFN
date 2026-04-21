package pkg.Atividade9;

public class Filme {
    private String titulo;
    private String diretor;
    private int duracaoEmMinutos;
    private String genero;

    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setDiretor(String diretor) { this.diretor = diretor; }
    public void setDuracaoEmMinutos(int duracao) { this.duracaoEmMinutos = duracao; }
    public void setGenero(String genero) { this.genero = genero; }

    public void exibirDetalhes() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Diretor: " + diretor);
        System.out.println("Duracao: " + duracaoEmMinutos + " minutos");
        System.out.println("Genero: " + genero);
    }

    public boolean ehLongo() {
        return duracaoEmMinutos > 120;
    }
}