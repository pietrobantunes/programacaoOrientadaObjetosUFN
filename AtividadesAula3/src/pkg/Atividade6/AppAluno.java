package pkg.Atividade6;

import java.util.Scanner;

public class AppAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Aluno a = new Aluno();

        System.out.print("Nome: ");
        a.nome = sc.nextLine();
        System.out.print("Matrícula: ");
        a.matricula = sc.nextLine();
        System.out.print("Nota 1: ");
        a.nota1 = sc.nextDouble();
        System.out.print("Nota 2: ");
        a.nota2 = sc.nextDouble();
        System.out.print("Nota 3: ");
        a.nota3 = sc.nextDouble();

        double media = (a.nota1 + a.nota2 + a.nota3) / 3;

        System.out.println("\nAluno:");
        System.out.println(a.nome + " - " + a.matricula);
        System.out.println("Média: " + media);

        if (media >= 6) System.out.println("Status: Aprovado");
        else System.out.println("Status: Reprovado");
        
        sc.close();
    }
}
