package pkg;

import java.util.Scanner;

/*
Atividade 2: Um motorista de taxi deseja calcular o rendimento de seu carro na praça. 
Sabendo-se que o preço do combustível é de R$4,90, escreva um algoritmo para ler a marcação do odômetro (marcador de quilometragem) 
no início do dia, a marcação no final do dia, o número de litros de combustível gasto e o valor total (R$) recebido dos passageiros. 
Calcule e escreva a média do consumo em Km/l e o lucro líquido do dia.

Fórmulas: Total quilometragem = marcação odômetro final do dia - marcação odômetro início do dia
Média do consumo = Total quilometragem/ quantidade de combustível gasto
Lucro do dia = Valor total recebido - (quantidade de combustível gasto * 4,90)
 */
public class Atividade2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double PRECO_COMBUSTIVEL = 4.90; // preço fixo do combustível

        // entradas
        System.out.print("Marcação do odômetro no início do dia (km): ");
        double inicio = sc.nextDouble();

        System.out.print("Marcação do odômetro no final do dia (km): ");
        double fim = sc.nextDouble();

        if (fim < inicio) {
            System.out.println("Erro: a marcação final não pode ser menor que a inicial.");
            sc.close();
            return;
        }

        System.out.print("Litros de combustível gastos no dia: ");
        double litros = sc.nextDouble();

        System.out.print("Valor total recebido dos passageiros (R$): ");
        double totalRecebido = sc.nextDouble();

        double totalKm = fim - inicio; // quilometragem percorrida no dia

        Double mediaConsumo = null;
        if (litros > 0) {
            mediaConsumo = totalKm / litros;
        }

        double custoCombustivel = litros * PRECO_COMBUSTIVEL; // custo do dia com combustível
        double lucroLiquido = totalRecebido - custoCombustivel; // lucro do dia

        // saídas
        System.out.println("\n=== Resultados ===");
        System.out.println("Total de km rodados: "+totalKm+" km");

        if (mediaConsumo != null) {
            System.out.println("Média de consumo: "+mediaConsumo+" km/l");
        } else {
            System.out.println("Média de consumo: impossível calcular (litros = 0)");
        }

        System.out.println("Custo com combustível: R$ "+custoCombustivel+"");
        System.out.println("Lucro líquido do dia: R$ "+lucroLiquido+"");

        sc.close();
    }
}
