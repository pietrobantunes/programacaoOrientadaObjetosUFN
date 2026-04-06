package pkg.Atividade4;

public class MainRetangulo {
    public static void main(String[] args) {

        Retangulo r = new Retangulo(5, 3);

        System.out.println("Largura: " + r.largura);
        System.out.println("Altura: " + r.altura);

        System.out.println("Area: " + r.calcularArea());
        System.out.println("Perimetro: " + r.calcularPerimetro());
        System.out.println("Diagonal: " + r.calcularDiagonal());

        System.out.println("É quadrado? " + r.ehQuadrado());
    }
}