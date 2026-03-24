package pkg.AtividadesAula5;

import java.util.Scanner;

public class Atividade7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//          EXCEÇÕES
//          NumberFormatException:
//           - Quando tentamos converter texto para número e o valor não é numérico.
//             Ex: Integer.parseInt("abc")
//         
//          InputMismatchException:
//           - Quando digitamos um tipo errado no Scanner.
//             Ex: digitar "A" quando o programa espera número.
//         
//          ArrayIndexOutOfBoundsException:
//           - Quando tentamos acessar uma posição inválida no array.
//             Ex: acessar posição 10 em um array de tamanho 3.
//         
//          ArithmeticException:
//           - Erro matemático, como divisão por zero.
//         
//          NullPointerException:
//           - Quando tentamos usar um objeto que está nulo.
//         
//          IllegalArgumentException:
//           - Quando um método recebe um argumento inválido.
//         
//          ClassCastException:
//           - Quando tentamos converter um objeto para um tipo incompatível.

        // Teste 1: NumberFormatException
        System.out.print("Digite um número para converter: ");
        String texto = sc.nextLine();

        try {
            int numero = Integer.parseInt(texto);
            System.out.println("Número convertido: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Erro: valor digitado não é um número.");
        }

        // Teste 2: ArrayIndexOutOfBoundsException e InputMismatchException
        String[] frutas = {"Maçã", "Pera", "Uva"};
        System.out.print("Digite o índice da fruta (0 a 2): ");

        try {
            int indice = sc.nextInt();

            System.out.println("Fruta escolhida: " + frutas[indice]);

        } catch (java.util.InputMismatchException e) {
            System.out.println("Erro: digite apenas números inteiros.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: índice fora dos limites do array.");
        }

        sc.close();
    }
}