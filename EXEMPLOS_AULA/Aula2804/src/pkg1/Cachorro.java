package pkg1;

public class Cachorro extends Animal {
	private String raca;
	
	public void latir() {
		System.out.println("Som do Cachorro: " + som);
	}
	
	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
}
