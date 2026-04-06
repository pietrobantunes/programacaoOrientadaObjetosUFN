package pkg.Atividade6;

public class MainCarro {
    public static void main(String[] args) {

        Carro c = new Carro("Fusca", 0, 120);

        System.out.println("Modelo: " + c.modelo);

        c.acelerar(50);
        System.out.println("Velocidade atual: " + c.velocidadeAtual);

        c.acelerar(100);
        System.out.println("Velocidade após acelerar muito: " + c.velocidadeAtual);

        System.out.println("Atingiu velocidade maxima? " + c.atingiuVelocidadeMaxima());

        c.frear(30);
        System.out.println("Velocidade após frear: " + c.velocidadeAtual);

        double tempo = c.calcularTempoViagem(240);
        System.out.println("Tempo de viagem (240km): " + tempo + " horas");
    }
}