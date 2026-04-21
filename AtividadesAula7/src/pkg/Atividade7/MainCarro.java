package pkg.Atividade7;

public class MainCarro {
    public static void main(String[] args) {

        Carro c = new Carro();

        c.acelerar();

        if (c.frear()) {
            System.out.println("Freou com sucesso");
        }
    }
}