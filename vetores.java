package pkg;

import java.util.Scanner;

public class vetores {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] vetor = new int[5]; // VETOR
				
				for(int i = 0; i < vetor.length; i++) {
					System.out.println("Digite o elemento ["+i+"]");
					vetor[i] = sc.nextInt();
				}
				
				System.out.println();
				
				for(int i = 0; i < vetor.length; i++) { // PRINT VETOR
					System.out.println("Elemento ["+i+"] = "+vetor[i]+"");
				}
				
				System.out.println();
				
		int[][] matriz = new int[2][2]; // MATRIZ 2X2
		
				for(int i = 0; i < 2; i++) {				
					for(int j = 0; j < 2; j++) {
						System.out.println("Digite o elemento ["+i+"]["+i+"]");
						matriz[i][j] = sc.nextInt();
					}
				}
				
				System.out.println();
				
				for(int a = 0; a < matriz.length; a++) { // PRINT MATRIZ 2X2
					for(int b = 0; b < matriz.length; b++) {
						System.out.println("Elemento ["+a+"]["+b+"]: "+matriz[a][b]+"");
					}
				}
				
				System.out.println();
				
				for(int a = 0; a < matriz.length; a++) {
					for(int b = 0; b < matriz.length; b++) {
						System.out.print(""+matriz[a][b]+"\t");
					}
					System.out.print("\n");
				}
				
		sc.close();
	}
}
