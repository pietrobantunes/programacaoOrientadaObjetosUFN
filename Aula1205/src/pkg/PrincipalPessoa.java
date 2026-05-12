package pkg;

public class PrincipalPessoa {
	public static void main(String[] args) {
		Pessoa p = new Pessoa("Ricardo", 41, null);
		exibeDadosPessoa(p);
	}
	
	public static void exibeDadosPessoa(Pessoa pe) {
		System.out.println("Nome: "+pe.getNome());
		System.out.println("Idade: "+pe.getIdade());
	}
}
