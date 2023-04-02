package classes;

public class CanetaFuncoes {
    // Atributos
    public int carga;
    public boolean checkTampada;
    public String modelo;

    // Geters e Seters

    // Métodos Geters e Seters do modelo da caneta
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Métodos Geters e seters da Cor
    public String cor;
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    // Métodos Geters e Seters da Caneta

    public void getCheckTampada(){
        if(checkTampada == true)
            System.out.println("Está Tampada!");
        else
            System.out.println("Está Destampada!");
    }

    public void setCheckTampada(boolean check) {
        this.checkTampada = check;
    }
}



