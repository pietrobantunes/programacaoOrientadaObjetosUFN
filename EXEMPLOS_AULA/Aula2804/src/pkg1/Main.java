package pkg1;

public class Main {
	public static void main(String[] args) {
		String nome = "Cachorro";
		int idade = 6;
		String som = "Au";
		
		Cachorro A1 = new Cachorro();
		A1.setNome(nome);
		A1.setIdade(idade);
		A1.setSom(som);
		
		A1.latir();
	}
}
