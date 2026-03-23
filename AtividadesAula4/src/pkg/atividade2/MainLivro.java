package pkg.atividade2;

import java.util.Scanner;

public class MainLivro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Livro livro = new Livro(
            "LivroNome",
            "AutorNome",
            2000,
            "TipoLivro"
        );

        int opc;

        do {
            System.out.println("\n1 - Ver informações do livro");
            System.out.println("2 - Emprestar livro");
            System.out.println("3 - Devolver livro");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("\n" + livro.info());
                    break;

                case 2:
                    livro.emprestar();
                    break;

                case 3:
                    livro.devolver();
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opc != 0);

        sc.close();
    }
}