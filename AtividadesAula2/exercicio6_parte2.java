package pkg;

import java.util.Scanner;

public class exercicio6_parte2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] cidades = new String[5];
        long[] populacoes = new long[5];

        System.out.println("Digite o nome de 5 cidades e suas populações:");
        for (int i = 0; i < cidades.length; i++) {
            System.out.print("Cidade " + (i + 1) + ": ");
            cidades[i] = sc.nextLine().trim();

            System.out.print("População de " + cidades[i] + ": ");
  
            while (!sc.hasNextLong()) {
                System.out.print("Valor inválido. Digite um número inteiro para a população: ");
                sc.next();
            }
            populacoes[i] = sc.nextLong();
            sc.nextLine();
        }

        int indiceMaisPopulosa = 0;
        for (int i = 1; i < populacoes.length; i++) {
            if (populacoes[i] > populacoes[indiceMaisPopulosa]) {
                indiceMaisPopulosa = i;
            }
        }

        System.out.println("Cidade mais populosa: " + cidades[indiceMaisPopulosa] + " (" + populacoes[indiceMaisPopulosa] + " habitantes)");
        sc.close();
    }
}