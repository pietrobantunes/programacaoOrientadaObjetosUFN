package pkg.atividade4;

public class ContaCorrente {
    private float saldo;

    public void definirSaldoInicial(float v) {
        saldo = v;
    }

    public void depositar(float v) {
        saldo += v;
    }

    public boolean sacar(float v) {
        if (saldo >= v) {
            saldo -= v;
            return true;
        }
        return false;
    }

    public float getSaldo() {
        return saldo;
    }
}
