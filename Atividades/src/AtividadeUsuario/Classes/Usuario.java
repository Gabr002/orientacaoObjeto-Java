package Classes;

public class Usuario {
    public String nome;
    public String login;
    public String senha;
    
    //  Constructor
    public Usuario(String nome, String login, String senha) {
        this.setNome(nome);
        this.setLogin(login);
        this.setSenha(senha);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
            this.nome = nome.toUpperCase();
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
