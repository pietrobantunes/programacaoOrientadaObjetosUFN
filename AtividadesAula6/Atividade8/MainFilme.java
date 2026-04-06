package pkg.Atividade8;

public class MainFilme {
    public static void main(String[] args) {

        Filme f = new Filme("Filme R16", 120, 16);

        System.out.println(f.descricaoFilme());

        System.out.println("Duracao em horas: " + f.converterDuracaoHoras());

        System.out.println("Pessoa de 15 anos pode assistir? " + f.podeAssistir(15));
        System.out.println("Pessoa de 18 anos pode assistir? " + f.podeAssistir(18));
    }
}