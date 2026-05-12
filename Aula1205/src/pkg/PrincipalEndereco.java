package pkg;

public class PrincipalEndereco {
	public static void main(String[] args) {
		// Endereco end = new Endereco("Rua Andradas", 1614);
		// Pessoa p = new Pessoa("UFN", 75, end);
		
		Pessoa p = new Pessoa("UFN", 75, new Endereco("Rua Andradas", 1614));
		
		System.out.println("Nome: "+p.getNome());
		System.out.println("Idade: "+p.getIdade());
		System.out.println("Endereço: "+p.getEndereco().toString());
		System.out.println("Rua: "+p.getEndereco().getRua());
		System.out.println("Número: "+p.getEndereco().getNumero());
	}
}
