package pkg;

import java.util.Scanner;
/*
 * 4 - Escreva um programa Java que use um laço para somar os números de 1 a 100. 
 */
public class exercicio4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i;
		int soma = 0;
		
		for(i = 1; i <= 100; i++) {
			soma = i + soma;
		}
		
		System.out.println("Soma dos números de 1 a 100: "+soma+"");
		
		sc.close();
	}
}
