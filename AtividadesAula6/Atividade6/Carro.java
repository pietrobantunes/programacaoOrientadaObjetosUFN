package pkg.Atividade6;

public class Carro {
    public String modelo;
    public int velocidadeAtual;
    public int velocidadeMaxima;

    public Carro(String modelo, int velocidadeAtual, int velocidadeMaxima) {
        this.modelo = modelo;
        this.velocidadeAtual = velocidadeAtual;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void acelerar(int valor) {
        velocidadeAtual += valor;

        if (velocidadeAtual > velocidadeMaxima) {
            velocidadeAtual = velocidadeMaxima;
        }
    }

    public void frear(int valor) {
        velocidadeAtual -= valor;

        if (velocidadeAtual < 0) {
            velocidadeAtual = 0;
        }
    }

    public boolean atingiuVelocidadeMaxima() {
        return velocidadeAtual == velocidadeMaxima;
    }

    public double calcularTempoViagem(double distancia) {
        if (velocidadeAtual == 0) {
            return 0;
        }

        return distancia / velocidadeAtual;
    }
}