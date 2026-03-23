package pkg.atividade4;

public class MainContaCorrente {
    public static void main(String[] args) {

        ContaCorrente novaConta = new ContaCorrente();

        // Definir saldo inicial de 1000
        novaConta.definirSaldoInicial(1000);
        System.out.println("Saldo após definir saldo inicial: " + novaConta.getSaldo());

        // Sacar 500
        boolean saque1 = novaConta.sacar(500);
        System.out.println("Saque de 500 realizado? " + saque1);
        System.out.println("Saldo atual: " + novaConta.getSaldo());

        // Depositar 50
        novaConta.depositar(50);
        System.out.println("Saldo após depósito de 50: " + novaConta.getSaldo());

        // Sacar 600
        boolean saque2 = novaConta.sacar(600);
        System.out.println("Saque de 600 realizado? " + saque2);
        System.out.println("Saldo atual: " + novaConta.getSaldo());
    }
}