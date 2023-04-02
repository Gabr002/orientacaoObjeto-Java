package AtividadeBanco;

public class FuncoesBanco {

    public String nome;
    public int saldo;
    public int saque;
    public int deposito;
    public int entrada;

    // Geters e seters

    // Geters e seters da entrada
    public int getEntrada() {
        return entrada;
    }
    public void setEntrada(int entrada) {
        this.entrada = entrada;
    }

    // get Saldo
    public int getSaldo() {
        return saldo;
    }

    // get Saque 
    public int getSaque() {
        return saque;
    }

    // get do Saque
    public void setSaque(int saque) {
        if(saque <= getSaldo()){
            this.saldo -= saque;
            System.out.println("\nSaque Realizado com Sucesso!");
        } else    
            System.out.println("\nSaldo Indisponivel!");
    }

    // get do deposito
    public int getDeposito() {
        return deposito;
    }

    // set do deposito
    public void setDeposito(int deposito) {
        this.saldo += deposito;
    }

    // get do nome
    public String getNome() {
        return nome;
    }

    // set do nome
    public void setNome(String nome) {
        this.nome = nome;
    }
}
