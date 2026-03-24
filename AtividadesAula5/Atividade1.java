package pkg.AtividadesAula5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Atividade1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		double raiz;
		
		System.out.println("Digite um número inteiro:");
		try {
			i = sc.nextInt();
			raiz = (double) Math.sqrt(i);
			System.out.println(raiz);
		} catch (InputMismatchException e) {
			System.out.println("ERRO: "+e+"");
		} catch (Exception e) {
			System.out.println("ERRO: "+e+"");
		}
		
		sc.close();
	}
}
