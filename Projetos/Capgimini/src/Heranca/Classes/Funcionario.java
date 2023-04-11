package Heranca.Classes;
import java.util.Date;


public class Funcionario {

    private String nome;
    private String cpf;
    private Date dataNascimento;
    private Double salario;
    
    
    // Constructor
    public Funcionario(String nome, Date dataNascimento, String cpf, Double salario) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setDataNascimento(dataNascimento);
        this.setSalario(salario);
    }


    // Metodos Acessores e Modificadores - Getters e Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public Date getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public Double getSalario() {
        return salario;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
    public String mostrarDados(){
        return "nome: " + this.getNome() + "\n" + "Data de nascimento: " + getDataNascimento().toString() + "\n" + "CPF: " + this.getCpf() + "\n " + "Salario: " + getSalario();
    }
    
}
