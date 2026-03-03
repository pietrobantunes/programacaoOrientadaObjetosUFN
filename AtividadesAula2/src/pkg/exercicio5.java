package pkg;

import java.util.Scanner;
/*
 * 5 - Escreva um programa Java que use um laço para calcular o fatorial de um número inteiro.
 */
public class exercicio5 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i;
		int fatorial;
		
		System.out.println("Digite um número inteiro: ");
		i = sc.nextInt();
		
		fatorial = i - 1;
		
			if(i == 0) {
				System.out.println("Fatorial do número inteiro: 1");
				fatorial = -1;
			}else if(i < 0) {
				System.out.println("Não é possível calcular fatorial de um número negativo.");
				fatorial = -1;
			}else{
				while(fatorial > 0) {
				i = i * fatorial;
				fatorial--;
				}
			}
			
			
		if(i >= 1) {
			System.out.println("Fatorial do número inteiro: "+i+"");
		}
		
		sc.close();
	}

}
