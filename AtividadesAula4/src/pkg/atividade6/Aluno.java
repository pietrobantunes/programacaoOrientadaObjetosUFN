package pkg.atividade6;

public class Aluno {
    public Aluno(String nome, int matricula) {
        System.out.println(nome + " - " + matricula);
    }

    public Aluno(String nasc) {
        System.out.println(nasc);
    }

    public Aluno(String nome, String nasc, int ano) {
        System.out.println(nome + " - " + nasc + " - " + ano);
    }
}