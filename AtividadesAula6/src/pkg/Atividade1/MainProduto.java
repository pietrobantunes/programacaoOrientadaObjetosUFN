package pkg.Atividade1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainProduto {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao = -1;
        String n = null;
        float p = 0;
        int q = 0;

        // CADASTRO DO PRODUTO
        try {
            System.out.println("CADASTRAR PRODUTO");

            System.out.println("Nome:");
            n = sc.nextLine();

            System.out.println("Preço (R$):");
            p = sc.nextFloat();

            System.out.println("Quantidade:");
            q = sc.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("Erro: valor digitado inválido. Encerrando programa...");
            sc.close();
            return; // evita continuar com dados inválidos
        }

        Produto novoProduto = new Produto(n, p, q);

        // MENU
        do {
            System.out.println("\nMENU");
            System.out.println("1 - Calcular valor total do estoque");
            System.out.println("2 - Adicionar produto ao estoque");
            System.out.println("3 - Registrar venda");
            System.out.println("4 - Verificar estoque");
            System.out.println("0 - Sair");
            System.out.println("Insira uma opção válida:");

            try {
                opcao = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Erro: digite apenas números.");
                sc.nextLine(); // limpa buffer
                continue;
            }

            switch (opcao) {

                case 1:
                    System.out.println("Valor total do estoque de \"" + n + "\": R$ " + novoProduto.calcularValorTotalEstoque());
                    break;

                case 2:
                    try {
                        System.out.println("Digite a quantidade de \"" + novoProduto.nome + "\" para adicionar:");
                        int add = sc.nextInt();
                        novoProduto.adicionarEstoque(add);
                        System.out.println("Quantidade disponível: " + novoProduto.quantidade);
                    } catch (InputMismatchException e) {
                        System.out.println("Erro: digite um número inteiro!");
                        sc.nextLine();
                    }
                    break;

                case 3:
                    try {
                        System.out.println("Digite a quantidade de \"" + novoProduto.nome + "\" vendidos:");
                        int venda = sc.nextInt();

                        if (novoProduto.vender(venda)) {
                            System.out.println("Quantidade disponível: " + novoProduto.quantidade);
                        } else {
                            System.out.println("Estoque insuficiente!");
                        }

                    } catch (InputMismatchException e) {
                        System.out.println("Erro: digite um número inteiro!");
                        sc.nextLine();
                    }
                    break;

                case 4:
                    if (novoProduto.temEstoque()) {
                        System.out.println("Produto \"" + novoProduto.nome + "\" está em estoque.");
                        System.out.println("Quantidade disponível: " + novoProduto.quantidade);
                    } else {
                        System.out.println("Produto está sem estoque.");
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Erro: Digite uma opção válida.");
            }

        } while (opcao != 0);

        sc.close();
    }
}