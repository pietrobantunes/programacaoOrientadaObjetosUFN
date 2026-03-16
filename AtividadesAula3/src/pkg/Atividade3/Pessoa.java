package pkg.Atividade3;

public class Pessoa {
    public String nome;
    public int idade;
    public String genero;

    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.nome = "Pietro";
        p.idade = 19;
        p.genero = "Masculino";

        System.out.println(p.nome + " - " + p.idade + " - " + p.genero);
    }
}
