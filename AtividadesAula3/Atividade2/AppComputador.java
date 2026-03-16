package pkg.Atividade2;

import java.util.Scanner;

public class AppComputador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Computador c1 = new Computador();
        System.out.print("Marca: ");
        c1.marca = sc.nextLine();
        System.out.print("Modelo: ");
        c1.modelo = sc.nextLine();
        System.out.print("Tipo: ");
        c1.tipo = sc.nextLine();
        System.out.print("Preço: ");
        c1.preco = sc.nextDouble();

        Computador c2 = new Computador();
        c2.marca = "Dell";
        c2.modelo = "Inspiron 15";
        c2.tipo = "Notebook";
        c2.preco = 3500;

        System.out.println("\nComputador 1:");
        System.out.println(c1.marca + " - " + c1.modelo + " - " + c1.tipo + " - R$" + c1.preco);

        System.out.println("\nComputador 2:");
        System.out.println(c2.marca + " - " + c2.modelo + " - " + c2.tipo + " - R$" + c2.preco);
        
        sc.close();
    }
}
