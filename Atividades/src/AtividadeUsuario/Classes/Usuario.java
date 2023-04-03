package Classes;

public class Usuario {
    public String nome;
    private String login;
    private String senha;
    
    public Usuario(String nome, String login, String senha) {
        this.setNome(nome);
        this.setLogin(login);
        this.setSenha(senha);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome == nome.toUpperCase())   
            this.nome = nome;
        else
            System.out.println("Escreva seu nome em caixa Alta!");
    }

    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        if(login == login.toLowerCase())   
            this.login = login;
        else
            System.out.println("Digite seu login em caixa baixa!");
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        if(senha.length() <= 16)
            this.senha = senha;
        else
            System.out.println("Digite apenas 16 caracteres.");
    }

    public void Status(){
        System.out.println("USUARIO: ");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Login: " + this.getLogin());
        System.out.println("Nome: " + this.getSenha());
    }
    
}
