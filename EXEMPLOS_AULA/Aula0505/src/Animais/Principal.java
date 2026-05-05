package Animais;

public class Principal {
	public static void main(String[] args) {
		System.out.println("Animal:");
		Animal a = new Animal();
		a.fazerSom();
		
		System.out.println("Cachorro:");
		Cachorro c = new Cachorro();
		c.fazerSom();
		
		System.out.println("Passarinho:");
		Passarinho pa = new Passarinho();
		pa.fazerSom();
		
		System.out.println("Peixe:");
		Peixe pe = new Peixe();
		pe.fazerSom();
	}
}
