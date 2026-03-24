package pkg;

public class ExcecoesEX2 {
	
	public static void main(String[] args) {
		// Exemplo 2: Divisão por zero
		int a = 10;
		int b = 0;
		try {
			System.out.println(a/b); // ArithmeticException
		} catch (ArithmeticException e) {
			System.out.println("Erro: Divisão por zero");
		}
	}
}
