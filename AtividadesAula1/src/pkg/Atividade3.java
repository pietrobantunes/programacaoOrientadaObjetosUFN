package pkg;

import java.util.Scanner;

/*
Atividade 3: Escrever um algoritmo para ler quatro valores float, calcular a sua média, e escrever na tela os que são superiores à média.
 */
public class Atividade3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float[] valores = new float[4];
        float soma = 0.0f;

        for (int i = 0; i < 4; i++) {
            System.out.print("Digite o "+(i + 1)+"º valor (float): ");
            valores[i] = sc.nextFloat();
            soma += valores[i];
        }

        // média
        float media = soma / 4.0f;

        // saída
        System.out.println("\nMédia: "+media+"");
        System.out.println("Valores superiores à média:");

        boolean algum = false;
        for (float v : valores) {
            if (v > media) {
                System.out.print(""+v+" ");
                algum = true;
            }
        }

        if (!algum) {
            System.out.println("(Nenhum valor está acima da média)");
        }

        sc.close();
    }
}
