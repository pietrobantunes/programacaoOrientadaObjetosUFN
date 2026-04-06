package pkg.Atividade4;

public class Retangulo {
    public double largura, altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double calcularArea() {
        return largura * altura;
    }

    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }

    public double calcularDiagonal() {
        return Math.sqrt(largura * largura + altura * altura);
    }

    public boolean ehQuadrado() {
        return largura == altura;
    }
}