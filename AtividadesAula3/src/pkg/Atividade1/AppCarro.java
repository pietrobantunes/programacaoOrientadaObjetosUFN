package pkg.Atividade1;

import java.util.Scanner;

public class AppCarro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Carro c1 = new Carro();
        System.out.print("Carro 1 - Marca: ");
        c1.marca = sc.nextLine();
        System.out.print("Carro 1 - Modelo: ");
        c1.modelo = sc.nextLine();
        System.out.print("Carro 1 - Ano: ");
        c1.anoFabricacao = sc.nextInt();
        sc.nextLine();

        Carro c2 = new Carro();
        System.out.print("Carro 2 - Marca: ");
        c2.marca = sc.nextLine();
        System.out.print("Carro 2 - Modelo: ");
        c2.modelo = sc.nextLine();
        System.out.print("Carro 2 - Ano: ");
        c2.anoFabricacao = sc.nextInt();

        System.out.println("\n--- Carros Cadastrados ---");
        System.out.println(c1.marca + " - " + c1.modelo + " - " + c1.anoFabricacao);
        System.out.println(c2.marca + " - " + c2.modelo + " - " + c2.anoFabricacao);
        
        sc.close();
    }
}
