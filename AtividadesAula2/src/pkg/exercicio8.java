package pkg;

import java.util.Scanner;
/*
 * 8 - Escreva um programa Java que use um laço para ler vários nomes de cidades do usuário até que o nome "São Paulo" seja lido.
 */
public class exercicio8 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i = 1;
		String cidade = "vazio";
		String spV1 = "SÃO PAULO";
		String spV2 = "SAO PAULO";
		
		while(i == 1) {
			System.out.println("Digite o nome de uma cidade:");
			cidade = sc.nextLine();
			cidade = cidade.toUpperCase();
			
			if(cidade.equals(spV1) || cidade.equals(spV2)){
			System.out.println("Cidade lida: "+cidade+", ENCERRANDO PROGRAMA...");
			break;
			}else{
				System.out.println("Cidade lida: "+cidade+", prossiga...");
				System.out.println();
			}
		}
		
		sc.close();
	}
}