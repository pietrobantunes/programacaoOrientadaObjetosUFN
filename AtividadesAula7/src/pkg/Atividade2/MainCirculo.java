package pkg.Atividade2;

import java.util.Scanner;

public class MainCirculo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Circulo c = new Circulo();

        System.out.print("Raio: ");
        c.setRaio(sc.nextDouble());

        System.out.println("Area: " + c.calculaArea());

        sc.close();
    }
}