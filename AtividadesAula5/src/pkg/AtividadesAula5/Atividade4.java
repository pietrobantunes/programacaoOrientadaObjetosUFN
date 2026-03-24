package pkg.AtividadesAula5;

import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomes = {"Ana", "Carlos", "Pedro", "Mariana", "Beatriz"};

        System.out.print("Digite um índice de 0 a 4: ");

        try {
            int numero = sc.nextInt();

            if (numero < 0 || numero > 4) {
                System.out.println("Erro: índice fora do limite!");
            } else {
                System.out.println("Nome: " + nomes[numero]);
            }

        } catch (java.util.InputMismatchException e) {
            System.out.println("Erro: você digitou uma letra! Digite apenas números.");
        } catch (Exception e) {
            System.out.println("Erro inesperado.");
        }

        sc.close();
    }
}