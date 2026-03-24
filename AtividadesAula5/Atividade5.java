package pkg.AtividadesAula5;

import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        String entrada = sc.nextLine();

        try {
            double celsius = Double.parseDouble(entrada);
            double fahrenheit = (celsius * 9 / 5) + 32;

            System.out.println("Temperatura em Fahrenheit: " + fahrenheit);

        } catch (java.util.InputMismatchException e) {
            System.out.println("Erro: valor inválido!");
        } catch (Exception e) {
            System.out.println("Erro: use ponto no lugar de vírgula.");
        }

        sc.close();
    }
}
