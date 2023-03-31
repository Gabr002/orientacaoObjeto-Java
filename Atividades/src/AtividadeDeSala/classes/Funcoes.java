package classes;

public class Funcoes{

    public String nome;
    public int saldo;

    public int saque(int valor){
        saldo -= valor;
        return saldo;
    }  
    public int deposito(int valor){
        saldo += valor;
        return saldo;
    }
}
