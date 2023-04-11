package Conteudo.Classes;

public class Funcionario {
    private String nome;
    private int numberConta;
    private Double saldoInicial;
    private Double saldo;

    public Funcionario(String nome, int numberConta, Double saldoInicial){
        
        this.setNome(nome);
        this.setNumberConta(numberConta);
        this.setSaldoInicial(saldoInicial);

    }

    // Getters & Setters
    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumberConta() {
        return numberConta;
    }

    public void setNumberConta(int numberConta) {
        this.numberConta = numberConta;
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public void menuOpcoes(){
        System.out.printf("1 - Extrato \n2 - Sacar\n3 - Depositar\n 4 - Sair");
    }

    public String switchDeOperacoes(int value){
        switch (value) {
            case 1:
                return "\nnome: " + this.getNome() + "numero da conta: " + this.getNumberConta() + "Saldo da conta: " + this.getSaldo();
                break;
            case 2;
                return
            default:
                break;
        } 
    }
    
}
