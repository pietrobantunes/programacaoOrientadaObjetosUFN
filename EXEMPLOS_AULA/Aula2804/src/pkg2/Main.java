package pkg2;

public class Main {
	public static void main(String[] args) {
		PessoaJuridica p1 = new PessoaJuridica("Ricardo", 41, "012345678-9", "Silva", "18/05/2000");
		p1.exibeDados();
		
		System.out.println();
		
		Pessoa p2 = new Pessoa("Pietro", 19);
		p2.exibeDados();
		
	}
}
