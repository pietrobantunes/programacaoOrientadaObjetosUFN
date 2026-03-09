package pkg;

import java.util.Scanner;

public class exercicio7_parte2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int ALUNOS = 3;
        final int DISCIPLINAS = 4;

        double[][] notas = new double[ALUNOS][DISCIPLINAS];

        System.out.println("Digite as notas de " + ALUNOS + " alunos em " + DISCIPLINAS + " disciplinas:");
        for (int i = 0; i < ALUNOS; i++) {
            System.out.println("Aluno " + (i + 1) + ":");
            for (int j = 0; j < DISCIPLINAS; j++) {
                System.out.print("  Nota na disciplina " + (j + 1) + ": ");
                notas[i][j] = sc.nextDouble();
            }
        }

        System.out.println("\nMaior e menor nota por disciplina:");
        for (int j = 0; j < DISCIPLINAS; j++) {
            double menor = notas[0][j];
            double maior = notas[0][j];

            for (int i = 1; i < ALUNOS; i++) {
                if (notas[i][j] < menor) menor = notas[i][j];
                if (notas[i][j] > maior) maior = notas[i][j];
            }

            System.out.printf("Disciplina %d -> Menor: %.2f | Maior: %.2f%n", (j + 1), menor, maior);
        }

        sc.close();
    }
}