package pkg.Atividade10;

import java.util.Scanner;

public class MainTarefa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Tarefa[] tarefas = new Tarefa[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite a tarefa " + (i + 1) + ": ");
            String desc = sc.nextLine();
            tarefas[i] = new Tarefa(desc);
        }

        System.out.print("Qual tarefa deseja concluir? (1-3): ");
        int escolha = sc.nextInt();

        if (escolha >= 1 && escolha <= 3) {
            tarefas[escolha - 1].concluirTarefa();
        }

        System.out.println("\nLista de tarefas:");
        for (int i = 0; i < 3; i++) {
            tarefas[i].exibirTarefa();
        }

        sc.close();
    }
}