package pkg;
import java.util.List;
import java.util.ArrayList;

public class PrincipalLista {
	public static void main(String[] args) {
		List<Pessoa> listaPessoas = new ArrayList<Pessoa>();
		
		Pessoa pessoa1 = new Pessoa("João", 30, null);
		Pessoa pessoa2 = new Pessoa("Maria", 25, null);
		Pessoa pessoa3 = new Pessoa("Pedro", 40, null);
		
		listaPessoas.add(pessoa1);
		listaPessoas.add(pessoa2);
		listaPessoas.add(pessoa3);
		
		exibirPessoas(listaPessoas);
	}
	
	public static void exibirPessoas(List<Pessoa> lista) {
		for (Pessoa p : lista) {
			System.out.println("Nome: " + p.getNome());
			System.out.println("Idade " + p.getIdade() + "\n");
		}
	}
}
