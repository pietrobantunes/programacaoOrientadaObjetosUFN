package pkg.AtividadesAula5;

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número decimal: ");
        String texto = sc.nextLine();

        try {
            double valor = Double.parseDouble(texto);
            System.out.println("Valor convertido: " + valor);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Erro: tipo de valor inválido!");
        } catch (Exception e) {
            System.out.println("Erro: não foi possível converter o valor.");
        }

        sc.close();
    }
}