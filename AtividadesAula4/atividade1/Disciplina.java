package pkg.atividade1;

import java.util.Scanner;

public class Disciplina {
    private String nome;
    private int cargaHoraria;
    private String professor;

    public void setNome(String nome) { this.nome = nome; }
    public void setCargaHoraria(int carga) { this.cargaHoraria = carga; }
    public void setProfessor(String professor) { this.professor = professor; }

    public String getNome() { return nome; }
    public int getCargaHoraria() { return cargaHoraria; }
    public String getProfessor() { return professor; }

    public static void main(String[] args) {
        Disciplina d = new Disciplina();

        d.setNome("Disciplina1");
        d.setCargaHoraria(80);
        d.setProfessor("Professor1");

        System.out.println("Conteúdo original:");
        System.out.println(d.getNome() + " - " + d.getCargaHoraria() + " - " + d.getProfessor());

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome da disciplina:");
        d.setNome(sc.nextLine());

        System.out.println("Digite a carga horária:");
        d.setCargaHoraria(sc.nextInt());
        sc.nextLine();

        System.out.println("Digite o nome do professor:");
        d.setProfessor(sc.nextLine());

        sc.close();

        System.out.println("Novo conteúdo:");
        System.out.println(d.getNome() + " - " + d.getCargaHoraria() + " - " + d.getProfessor());
    }
}