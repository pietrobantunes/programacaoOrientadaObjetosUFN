package pkg.Atividade5;

import java.util.Scanner;

public class MainTriangulo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Triangulo t = new Triangulo();

        System.out.print("Lado A: ");
        t.setLadoA(sc.nextDouble());

        System.out.print("Lado B: ");
        t.setLadoB(sc.nextDouble());

        System.out.print("Lado C: ");
        t.setLadoC(sc.nextDouble());

        System.out.println("Equilatero: " + t.verificaEquilatero());

        sc.close();
    }
}