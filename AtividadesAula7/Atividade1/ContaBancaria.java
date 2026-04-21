package pkg.Atividade1;

public class ContaBancaria {
    private double saldo;
    private double limite;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public boolean saque(double valor) {
        if (valor <= saldo + limite) {
            saldo -= valor;
            return true;
        }
        return false;
    }
}