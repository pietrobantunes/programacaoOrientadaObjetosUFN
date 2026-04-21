package pkg.Atividade5;

public class Triangulo {
    private double ladoA, ladoB, ladoC;

    public void setLadoA(double ladoA) { this.ladoA = ladoA; }
    public void setLadoB(double ladoB) { this.ladoB = ladoB; }
    public void setLadoC(double ladoC) { this.ladoC = ladoC; }

    public boolean verificaEquilatero() {
        return ladoA == ladoB && ladoB == ladoC;
    }
}