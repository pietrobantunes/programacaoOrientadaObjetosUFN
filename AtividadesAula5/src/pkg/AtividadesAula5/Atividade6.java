package pkg.AtividadesAula5;

import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double premio = 5000.0;

        System.out.print("Quantos ganhadores dividirão o prêmio? ");

        try {
            int qtd = sc.nextInt();

            if (qtd == 0) {
                System.out.println("Erro: não pode dividir por zero!");
            } else if (qtd < 0) {
                System.out.println("Erro: número inválido!");
            } else {
                double valor = premio / qtd;
                System.out.println("Cada pessoa receberá: R$ " + valor);
            }

        } catch (java.util.InputMismatchException e) {
            System.out.println("Erro: você deve digitar um número inteiro!");
        } catch (Exception e) {
            System.out.println("Erro inesperado.");
        }

        sc.close();
    }
}
