package pkg;

import java.util.Scanner;

public class lacosDeRepeticao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um inteiro:");
		int n = sc.nextInt();
		System.out.println("Int digitado: "+n+"");
		
		System.out.println("\nDigite um double:");
		double d = sc.nextDouble();
		System.out.println("Double digitado: "+d+"");
		
		System.out.println("\nDigite uma frase/palavra:");
		sc.nextLine();
		String palavra = sc.nextLine();
		System.out.println("Frase/palavra digitada: "+palavra+"");
		
		System.out.println("\nDigite uma palavra:");
		palavra = sc.next();
		System.out.println("Palavra digitada com .next: "+palavra+"\n");
		
		sc.close(); // fechamento do scanner
		
		for(int i = 0; i < 10; i++) { // o i (por estar sendo declarado dentro do for) existirá somente aqui dentro
			System.out.println("(for): I vale: "+i+"");
		}
		
		System.out.println(); // pula linha
		
		int i = 0;
		while(i < 10) {
			System.out.println("(while): I vale: "+i+"");
			i++;
		}
		
		System.out.println(); // pula linha
		
		i = 0; // zera o ""i
		do{
			System.out.println("(do while): I vale: "+i+"");
			i++;
		}while(i < 10);
	}
}
