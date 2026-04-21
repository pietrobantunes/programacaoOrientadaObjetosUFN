package pkg.Atividade6;

public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;

    public void setNome(String nome) { this.nome = nome; }
    public void setIdade(int idade) { this.idade = idade; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public boolean verificaMaiorDeIdade() {
        return idade >= 18;
    }
}