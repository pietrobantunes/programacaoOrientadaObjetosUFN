package pkg.Atividade3;

public class Aluno {
    public String nome;
    public double nota1, nota2, nota3;

    public Aluno(String nome, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double calcularMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }

    public boolean aprovado() {
        return calcularMedia() >= 7;
    }

    public double maiorNota() {
        return Math.max(nota1, Math.max(nota2, nota3));
    }

    public double menorNota() {
        return Math.min(nota1, Math.min(nota2, nota3));
    }
}