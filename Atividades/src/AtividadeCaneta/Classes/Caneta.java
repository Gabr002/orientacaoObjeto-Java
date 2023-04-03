// Meu código

package Classes;

public class Caneta {

    // Atributos
    public String modelo;
    private float ponta;
    public String cor;
    private boolean tampada;
    
    // Inserir métodos...

    public Caneta(String modelo, float ponta, String cor) {
        this.modelo = modelo;
        this.ponta = ponta;
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    
    /* public Caneta (String m, String c, float p){ // Este é o meu constructor
        this.setModelo(m);
        this.setCor(c);
        this.setPonta(p);
        this.tampar();

    }

    // Geters e Seters

    
    
    // Get e set Ponta
    
    // get
    public float getPonta() {
        return ponta;
    }
    // set
    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    // Métodos Geters e Seters do modelo da caneta
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Métodos Geters e seters da Cor
    
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    // Métodos Geters e Seters da Caneta

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }

    public void Status() {
        System.out.println("SOBRE A CANETA:");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    } */

    
}


