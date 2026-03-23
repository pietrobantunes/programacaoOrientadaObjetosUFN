package pkg.atividade3;

public class Pessoa {
    public String nome;
    public String email;
    public String nasc;
    public String end;
    public boolean admin;

    public Pessoa(String n, String e, String d, String en, boolean a) {
        nome = n;
        email = e;
        nasc = d;
        end = en;
        admin = a;
    }

    public String getEmail() { return email; }
    public void promoverAdmin() { admin = true; }
}