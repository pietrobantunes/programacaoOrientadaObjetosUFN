package pkg.Atividade9;

import java.util.Scanner;

public class MainFilme {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Filme f = new Filme();

        System.out.print("Titulo: ");
        f.setTitulo(sc.nextLine());

        System.out.print("Diretor: ");
        f.setDiretor(sc.nextLine());

        System.out.print("Duracao (min): ");
        f.setDuracaoEmMinutos(sc.nextInt());
        sc.nextLine();

        System.out.print("Genero: ");
        f.setGenero(sc.nextLine());

        System.out.println("\nDetalhes do filme:");
        f.exibirDetalhes();

        System.out.println("Filme longo: " + f.ehLongo());

        sc.close();
    }
}