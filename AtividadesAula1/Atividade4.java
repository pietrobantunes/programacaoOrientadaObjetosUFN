package pkg;

import java.util.Scanner;

/*
Atividade 4: Escreva um algoritmo que leia um ponto (x,y) pelo teclado e informe em qual quadrante o ponto se encontra 
no plano cartesiano ou se o ponto está sobre um dos eixos.
 */
public class Atividade4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // entrada de x e y
        System.out.print("Digite x: ");
        double x = sc.nextDouble();
        System.out.print("Digite y: ");
        double y = sc.nextDouble();

        if (x == 0 && y == 0) {
            System.out.println("Origem");
        } else if (x == 0) {
            System.out.println("Sobre o eixo Y");
        } else if (y == 0) {
            System.out.println("Sobre o eixo X");
        } else if (x > 0 && y > 0) {
            System.out.println("1º quadrante");
        } else if (x < 0 && y > 0) {
            System.out.println("2º quadrante");
        } else if (x < 0 && y < 0) {
            System.out.println("3º quadrante");
        } else {
            System.out.println("4º quadrante");
        }

        sc.close();
    }
}
