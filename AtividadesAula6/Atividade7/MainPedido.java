package pkg.Atividade7;

public class MainPedido {
    public static void main(String[] args) {

        Pedido p = new Pedido(1, "Teclado", 100, 2);

        System.out.println(p.resumoPedido());

        System.out.println("Subtotal: " + p.calcularSubtotal());

        System.out.println("Desconto (10%): " + p.calcularDesconto(10));

        System.out.println("Total com desconto: " + p.calcularTotal(10));
    }
}