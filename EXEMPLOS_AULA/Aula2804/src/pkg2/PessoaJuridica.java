package pkg2;

public class PessoaJuridica extends Pessoa {

	protected String CNPJ;
	protected String socio;
	protected String dtAbertura;
	
	public PessoaJuridica(String nome, int idade, String cnpj, String socio, String dtAbertura) {
		super(nome, idade); // Pessoa p = new Pessoa(nome, idade)
		this.CNPJ = cnpj;
		this.socio = socio;
		this.dtAbertura = dtAbertura;
	}
	
	public void exibeDados() {
		super.exibeDados();
		System.out.println("CNPJ: "+CNPJ);
		System.out.println("Sócio: "+socio);
		System.out.println("Data de Abertura: "+dtAbertura);
	}
}
