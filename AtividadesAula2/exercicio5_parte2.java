package pkg;

import java.util.Scanner;

public class exercicio5_parte2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        int menor = numeros[0];
        int maior = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < menor) menor = numeros[i];
            if (numeros[i] > maior) maior = numeros[i];
        }

        System.out.println("Menor valor: " + menor);
        System.out.println("Maior valor: " + maior);
        sc.close();
    }
}
