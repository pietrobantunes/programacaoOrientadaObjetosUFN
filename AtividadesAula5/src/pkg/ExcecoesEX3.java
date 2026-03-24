package pkg;

public class ExcecoesEX3 {
	
	public static void main(String[] args) {
		// Exemplo 3: Tentando converter uma String em um número
		String numero = "abc";
		try {
		int valor = Integer.parseInt(numero); // NumberFormatException
		} catch (NumberFormatException e) {
			System.out.println("Erro: Formato inválido");
		}
	}
}
