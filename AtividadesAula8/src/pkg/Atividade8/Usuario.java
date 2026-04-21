package pkg.Atividade8;

public class Usuario {
    private String nomeUsuario;
    private String senha;
    private boolean logado;

    public Usuario(String nomeUsuario, String senha) {
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
        this.logado = false;
    }

    public boolean login(String usuario, String senha) {
        if (this.nomeUsuario.equals(usuario) && this.senha.equals(senha)) {
            logado = true;
            return true;
        }
        return false;
    }

    public void logout() {
        logado = false;
    }

    public void exibirStatus() {
        if (logado) {
            System.out.println("Usuario está logado.");
        } else {
            System.out.println("Usuario não está logado.");
        }
    }
}