package pkg.Atividade4;

import java.util.Scanner;

public class MainCarro {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Carro c = new Carro();

        System.out.print("Marca: ");
        c.setMarca(sc.nextLine());

        System.out.print("Modelo: ");
        c.setModelo(sc.nextLine());

        System.out.print("Ano: ");
        c.setAno(sc.nextInt());

        c.exibeDetalhes();

        sc.close();
    }
}