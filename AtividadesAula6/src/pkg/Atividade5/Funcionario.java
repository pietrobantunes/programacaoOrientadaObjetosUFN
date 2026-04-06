package pkg.Atividade5;

public class Funcionario {
    public String nome;
    public double salario;
    public int horasExtras;

    public Funcionario(String nome, double salario, int horasExtras) {
        this.nome = nome;
        this.salario = salario;
        this.horasExtras = horasExtras;
    }

    public double calcularValorHoraExtra() {
        return horasExtras * 50;
    }

    public double calcularPagamentoTotal() {
        return salario + calcularValorHoraExtra();
    }

    public void adicionarHorasExtras(int horas) {
        horasExtras += horas;
    }

    public double salarioAnual() {
        return salario * 12;
    }
}