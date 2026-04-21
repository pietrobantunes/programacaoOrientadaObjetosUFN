package pkg.Atividade8;

public class MainRetangulo {
    public static void main(String[] args) {

        Retangulo r = new Retangulo(5, 4);

        r.calcular_area();

        r.inserir_lados(10, 2);

        r.calcular_area();
    }
}