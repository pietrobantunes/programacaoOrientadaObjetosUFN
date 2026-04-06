package pkg.Atividade10;

public class MainTime {
    public static void main(String[] args) {

        Time t = new Time("Brasil");

        t.marcarGol();
        t.marcarGol();
        t.sofrerGol();

        System.out.println("Gols marcados: " + t.golsMarcados);
        System.out.println("Gols sofridos: " + t.golsSofridos);

        System.out.println("Saldo de gols: " + t.saldoGols());
        System.out.println("Resultado: " + t.resultadoPartida());
    }
}