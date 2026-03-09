package pkg;

import java.util.Scanner;

public class exercicio3_parte2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[5];
        double soma = 0.0;

        System.out.println("Digite as notas de 5 alunos:");
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota do aluno " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
            soma += notas[i];
        }

        double media = soma / notas.length;
        System.out.printf("Média das notas: %.2f%n", media);
        sc.close();
    }
}
