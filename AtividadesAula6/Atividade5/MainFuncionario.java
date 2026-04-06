package pkg.Atividade5;

public class MainFuncionario {
    public static void main(String[] args) {

        Funcionario f = new Funcionario("Ana", 2000, 10);

        System.out.println("Funcionario: " + f.nome);
        System.out.println("Salario base: " + f.salario);

        System.out.println("Horas extras: " + f.horasExtras);
        System.out.println("Valor horas extras: " + f.calcularValorHoraExtra());

        System.out.println("Pagamento total: " + f.calcularPagamentoTotal());

        f.adicionarHorasExtras(5);

        System.out.println("\nApós adicionar mais horas extras:");

        System.out.println("Horas extras: " + f.horasExtras);
        System.out.println("Novo valor horas extras: " + f.calcularValorHoraExtra());
        System.out.println("Novo pagamento total: " + f.calcularPagamentoTotal());

        System.out.println("Salario anual (sem extras): " + f.salarioAnual());
    }
}