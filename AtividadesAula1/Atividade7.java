package pkg;

import java.util.Scanner;

/*
Atividade 7: Escreva um algoritmo que leia dois valores pelo teclado e informe se os mesmos são múltiplos um do outro ou não.
 */
public class Atividade7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // entradas
        System.out.print("Digite o 1º valor (inteiro): ");
        int a = sc.nextInt();

        System.out.print("Digite o 2º valor (inteiro): ");
        int b = sc.nextInt();

        boolean multiplos;

        if (a == 0 && b == 0) {
            multiplos = true;
        } else if (a == 0 || b == 0) {
            multiplos = true;
        } else {
            multiplos = (a % b == 0) || (b % a == 0);
        }

        // saída
        if (multiplos) {
            System.out.println("São múltiplos.");
        } else {
            System.out.println("Não são múltiplos.");
        }

        sc.close();
    }
}
