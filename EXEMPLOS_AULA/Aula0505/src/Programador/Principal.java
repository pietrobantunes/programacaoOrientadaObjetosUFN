package Programador;

public class Principal {
	public static void main(String[] args) {
		System.out.println("Pessoa:");
		Pessoa pe = new Pessoa();
		pe.trabalhar();
		
		System.out.println("Programador:");
		Pessoa pr = new Programador();
		pr.trabalhar();
	}
}
