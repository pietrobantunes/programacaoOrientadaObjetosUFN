package pkg;

import java.util.Scanner;
/*
 * 6 - Escreva um programa Java que use um laço para ler uma sequência de números inteiros do usuário até que o número 0 seja lido.
 */
public class exercicio6 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = -1;
		
		System.out.println("Digite números inteiros:");
		while(n != 0) {
			n = sc.nextInt();
			
			if(n != 0) {
			System.out.println("LIDO: "+n+", continue digitando...");
			}else{
				System.out.println("LIDO: "+n+", ENCERRANDO PROGRAMA...");
			}
		}
		
		sc.close();
	}
}