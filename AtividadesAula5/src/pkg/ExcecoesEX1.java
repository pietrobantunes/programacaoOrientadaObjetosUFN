package pkg;

public class ExcecoesEX1 {
	
	public static void main(String[] args) {
		// Exemplo 1: Tentando acessar um elemento fora de índice de um array
		try {
		int[] numeros = {1, 2, 3};
		System.out.println(numeros[3]); // ArrayIndexOutOfBoundsException
		} catch (ArrayIndexOutOfBoundsException e) { // EXCEÇÃO ESPECÍFICA
			System.out.println("Erro: índice fora do array \n"+e.toString());
		} catch (Exception e) { // EXCEÇÃO AMPLA
			System.out.println("Exceção: "+e.toString());
		}
		
		System.out.println("[Essa mensagem aparece mesmo após o erro, devido ao try catch que não encerrou o programa]");
	}
}

