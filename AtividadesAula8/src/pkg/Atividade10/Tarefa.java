package pkg.Atividade10;

public class Tarefa {
    private String descricao;
    private boolean concluida;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.concluida = false;
    }

    public void concluirTarefa() {
        concluida = true;
    }

    public void exibirTarefa() {
        System.out.println("Tarefa: " + descricao + " | Concluida: " + concluida);
    }
}