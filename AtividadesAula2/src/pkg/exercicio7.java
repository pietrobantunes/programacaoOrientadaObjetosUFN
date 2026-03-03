package pkg;

import java.util.Scanner;
/*
 * 7 - Escreva um programa Java que use um laço para ler a nota de vários alunos até que seja lida a nota -1.
 */
public class exercicio7 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		int aluno = 1;
		
		while(n != -1) {
			System.out.println("Digite a nota do aluno "+aluno+":");
			aluno++;
			n = sc.nextInt();
			
			if(n != -1) {
			System.out.println("Nota inserida: "+n+", prossiga...");
			System.out.println();
			}else{
				System.out.println("Nota inserida: "+n+", ENCERRANDO PROGRAMA...");
			}
		}
		
		sc.close();
	}
}