package pkg.Atividade2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainContaBancaria {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ContaBancaria conta1 = null;
        ContaBancaria conta2 = null;

        System.out.println("CADASTRO DAS CONTAS");

        try {
            // Conta 1
            System.out.println("Titular da Conta 1:");
            String titular1 = sc.nextLine();

            System.out.println("Saldo inicial da Conta 1:");
            double saldo1 = sc.nextDouble();
            sc.nextLine(); // limpa buffer

            conta1 = new ContaBancaria(titular1, saldo1);

            // Conta 2
            System.out.println("\nTitular da Conta 2:");
            String titular2 = sc.nextLine();

            System.out.println("Saldo inicial da Conta 2:");
            double saldo2 = sc.nextDouble();
            sc.nextLine(); // limpa buffer

            conta2 = new ContaBancaria(titular2, saldo2);

        } catch (InputMismatchException e) {
            System.out.println("Erro: Valor inválido. Encerrando o programa.");
            sc.close();
            return;
        }

        int opcao = -1;

        do {
            System.out.println("\nMENU");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Transferir");
            System.out.println("0 - Sair");
            System.out.println("Insira uma opção válida:");

            try {
                opcao = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Erro: Digite apenas números!");
                sc.nextLine();
                continue;
            }

            switch (opcao) {

                case 1:
                    System.out.println("\nSALDOS");
                    System.out.println(conta1.titular + ": R$ " + conta1.consultarSaldo());
                    System.out.println(conta2.titular + ": R$ " + conta2.consultarSaldo());
                    break;

                case 2:
                    try {
                        System.out.println("Depositar em qual conta? (1 ou 2)");
                        int escolha = sc.nextInt();

                        System.out.println("Valor do depósito:");
                        double valor = sc.nextDouble();

                        if (escolha == 1) {
                            conta1.depositar(valor);
                        } else if (escolha == 2) {
                            conta2.depositar(valor);
                        } else {
                            System.out.println("Conta inválida!");
                        }

                    } catch (InputMismatchException e) {
                        System.out.println("Erro: Digite valores válidos!");
                        sc.nextLine();
                    }
                    break;

                case 3:
                    try {
                        System.out.println("Sacar de qual conta? (1 ou 2)");
                        int escolha = sc.nextInt();

                        System.out.println("Valor do saque:");
                        double valor = sc.nextDouble();

                        boolean resultado;

                        if (escolha == 1) {
                            resultado = conta1.sacar(valor);
                        } else if (escolha == 2) {
                            resultado = conta2.sacar(valor);
                        } else {
                            System.out.println("Conta inválida!");
                            break;
                        }

                        if (resultado) {
                            System.out.println("Saque realizado com sucesso.");
                        } else {
                            System.out.println("Saldo insuficiente.");
                        }

                    } catch (InputMismatchException e) {
                        System.out.println("Erro: Digite valores válidos!");
                        sc.nextLine();
                    }
                    break;

                case 4:
                    try {
                        System.out.println("Transferir de qual conta? (1 -> 2) (2 -> 1)");
                        int escolha = sc.nextInt();

                        System.out.println("Valor da transferência:");
                        double valor = sc.nextDouble();

                        boolean resultado;

                        if (escolha == 1) {
                            resultado = conta1.transferir(valor, conta2);
                        } else if (escolha == 2) {
                            resultado = conta2.transferir(valor, conta1);
                        } else {
                            System.out.println("Conta inválida!");
                            break;
                        }

                        if (resultado) {
                            System.out.println("Transferência realizada com sucesso.");
                        } else {
                            System.out.println("Saldo insuficiente para transferir.");
                        }

                    } catch (InputMismatchException e) {
                        System.out.println("Erro: Digite valores válidos!");
                        sc.nextLine();
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}