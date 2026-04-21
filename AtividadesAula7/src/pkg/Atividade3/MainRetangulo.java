package pkg.Atividade3;

import java.util.Scanner;

public class MainRetangulo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Retangulo r = new Retangulo();

        System.out.print("Base: ");
        r.setBase(sc.nextDouble());

        System.out.print("Altura: ");
        r.setAltura(sc.nextDouble());

        System.out.println("Area: " + r.calculaArea());

        sc.close();
    }
}