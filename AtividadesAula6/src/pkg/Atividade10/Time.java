package pkg.Atividade10;

public class Time {
    public String nome;
    public int golsMarcados;
    public int golsSofridos;

    public Time(String nome) {
        this.nome = nome;
    }

    public void marcarGol() {
        golsMarcados++;
    }

    public void sofrerGol() {
        golsSofridos++;
    }

    public int saldoGols() {
        return golsMarcados - golsSofridos;
    }

    public String resultadoPartida() {
        if (saldoGols() > 0) {
            return "Vitoria";
        } else if (saldoGols() == 0) {
            return "Empate";
        } else {
            return "Derrota";
        }
    }
}