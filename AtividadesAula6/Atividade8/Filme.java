package pkg.Atividade8;

public class Filme {
    public String titulo;
    public int duracao;
    public int classificacaoEtaria;

    public Filme(String titulo, int duracao, int classificacaoEtaria) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.classificacaoEtaria = classificacaoEtaria;
    }

    public double converterDuracaoHoras() {
        return duracao / 60.0;
    }

    public boolean podeAssistir(int idade) {
        return idade >= classificacaoEtaria;
    }

    public String descricaoFilme() {
        return titulo + " - " + duracao + " min";
    }
}