package pkg.Atividade8;

public class Retangulo {
    private int x;
    private int y;

    public Retangulo(int a, int b) {
        x = a;
        y = b;
    }

    public void inserir_lados(int a, int b) {
        x = a;
        y = b;
    }

    public void calcular_area() {
        int area = x * y;
        System.out.println("Area: " + area);
    }
}