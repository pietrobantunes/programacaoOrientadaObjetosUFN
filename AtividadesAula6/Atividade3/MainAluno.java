package pkg.Atividade3;

public class MainAluno {
    public static void main(String[] args) {

        Aluno a = new Aluno("Pedro", 7, 8, 6);

        System.out.println("Aluno: " + a.nome);

        System.out.println("Media: " + a.calcularMedia());
        System.out.println("Aprovado? " + a.aprovado());

        System.out.println("Maior nota: " + a.maiorNota());
        System.out.println("Menor nota: " + a.menorNota());
    }
}