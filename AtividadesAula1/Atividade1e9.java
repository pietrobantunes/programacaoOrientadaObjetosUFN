package pkg;

import java.util.Scanner;

/*
Atividade 1: Faça um programa para leitura de dois números e após faça as quatro operações matemáticas (Soma, Subtração, Multiplicação e divisão)
+
Atividade 9: Altere o exercício 1 e faça um menu utilizando switch case
 */
public class Atividade1e9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // entrada dos dois números base para as operações
        System.out.print("Digite o 1º número: ");
        double a = sc.nextDouble();

        System.out.print("Digite o 2º número: ");
        double b = sc.nextDouble();

        int opcao; // opção do menu escolhida pelo usuário

        // repetição que mostra o menu até o usuário escolher sair
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Soma (a + b)");
            System.out.println("2 - Subtração (a - b)");
            System.out.println("3 - Multiplicação (a * b)");
            System.out.println("4 - Divisão (a / b)");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            // switch-case com base na opção
            switch (opcao) {
                case 1:
                    System.out.println("Resultado da soma: "+(a + b)+"");
                    break;
                case 2:
                    System.out.println("Resultado da subtração: "+(a - b)+"");
                    break;
                case 3:
                    System.out.println("Resultado da multiplicação: "+(a * b)+"");
                    break;
                case 4:
                    if (b != 0) {
                        System.out.println("Resultado da divisão: "+(a / b)+"");
                    } else {
                        System.out.println("Impossível dividir por zero.");
                    }
                    break;
                case 0:
                    System.out.println("Encerrando.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        sc.close();
    }
}
