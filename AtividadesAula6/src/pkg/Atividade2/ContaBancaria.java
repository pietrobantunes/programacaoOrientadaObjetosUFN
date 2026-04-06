package pkg.Atividade2;

public class ContaBancaria {

    public String titular;
    public double saldo;

    public ContaBancaria(String titular, double saldoInicial) {

        this.titular = titular;

        if (saldoInicial < 0) {
            System.out.println("Saldo inicial inválido! Não pode ser negativo. Definindo como 0.");
            this.saldo = 0;
        } else {
            this.saldo = saldoInicial;
        }
    }

    public void depositar(double valor) {
        if (valor < 0) {
            System.out.println("Erro: Não é permitido depositar valores negativos.");
            return;
        }

        this.saldo += valor;
        System.out.println("Depósito realizado com sucesso.");
    }

    public boolean sacar(double valor) {
        if (valor < 0) {
            System.out.println("Erro: Não é permitido sacar valores negativos.");
            return false;
        }

        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transferir(double valor, ContaBancaria destino) {
        if (valor < 0) {
            System.out.println("Erro: Não é permitido transferir valores negativos.");
            return false;
        }

        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.saldo += valor;
            return true;
        } else {
            return false;
        }
    }

    public double consultarSaldo() {
        return this.saldo;
    }
}