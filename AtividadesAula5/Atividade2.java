package pkg.AtividadesAula5;

import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1 = 0, n2 = 0, resultado = 0;
        char op;

        try {
            System.out.print("Digite o primeiro número: ");
            n1 = sc.nextDouble();

            System.out.print("Digite o segundo número: ");
            n2 = sc.nextDouble();

            System.out.print("Digite a operação (+, -, *, /): ");
            op = sc.next().charAt(0);

            if (op == '+') {
                resultado = n1 + n2;
            } else if (op == '-') {
                resultado = n1 - n2;
            } else if (op == '*') {
                resultado = n1 * n2;
            } else if (op == '/') {
                if (n2 == 0) {
                    System.out.println("Erro: divisão por zero!");
                    sc.close();
                    return;
                }
                resultado = n1 / n2;
            } else {
                System.out.println("Operação inválida!");
                sc.close();
                return;
            }

            System.out.println("Resultado: " + resultado);

        } catch (java.util.InputMismatchException e) {
            System.out.println("Erro: você digitou algo que não é número!");
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }

        sc.close();
    }
}