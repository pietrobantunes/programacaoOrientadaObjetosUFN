package pkg.Atividade1;

import java.util.Scanner;

public class MainContaBancaria {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria();

        System.out.print("Saldo: ");
        conta.setSaldo(sc.nextDouble());

        System.out.print("Limite: ");
        conta.setLimite(sc.nextDouble());

        System.out.print("Valor para saque: ");
        double valor = sc.nextDouble();

        if (conta.saque(valor)) {
            System.out.println("Saque realizado!");
        } else {
            System.out.println("Saldo insuficiente!");
        }

        System.out.println("Saldo final: " + conta.getSaldo());

        sc.close();
    }
}