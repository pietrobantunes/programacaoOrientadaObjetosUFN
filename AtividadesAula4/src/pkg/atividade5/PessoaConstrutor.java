package pkg.atividade5;

public class PessoaConstrutor {
    public PessoaConstrutor(String nome, int idade) {
        System.out.println(nome + " - " + idade);
    }

    public PessoaConstrutor(int idade) {
        System.out.println(idade);
    }
}