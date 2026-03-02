package pkg;

import java.util.Scanner;

/*
Atividade 5: Escreva um algoritmo que leia 3 valores pelo teclado e então informe qual o maior deles.
+
Atividade 6: Ajuste o exercício 5 de maneira que mostre os valores informados em ordem crescente.
 */

public class Atividade5e6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // entradas
        System.out.print("Digite o 1º valor: ");
        double a = sc.nextDouble();

        System.out.print("Digite o 2º valor: ");
        double b = sc.nextDouble();

        System.out.print("Digite o 3º valor: ");
        double c = sc.nextDouble();

        double maior;

        // descobrir maior valor
        if (a >= b && a >= c) {
            maior = a;
            System.out.println("Maior valor --> 1º Valor ("+maior+")");
        }
        else if (b >= a && b >= c) {
            maior = b;
            System.out.println("Maior valor --> 2º Valor ("+maior+")");
        }
        else {
            maior = c;
            System.out.println("Maior valor --> 3º Valor ("+maior+")");
        }

        // colocar em ordem crescente
        
        // se a > b, troca
        if (a > b) {
            double temp = a;
            a = b;
            b = temp;
        }

        // se b > c, troca
        if (b > c) {
            double temp = b;
            b = c;
            c = temp;
        }

        // verificação novamente em a e b
        if (a > b) {
            double temp = a;
            a = b;
            b = temp;
        }

        // saída
        System.out.println("\nValores em ordem crescente:");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        sc.close();
    }
}
