package Classes;

public class Pessoa {

    // Atributos - Atribuidor de acesso
    public float peso;
    public float altura;

    public float calcularIMC() {
        float imc = peso/ (altura*altura);
        return imc;
    }

    // Métodos acessores - Metodos Getres e Seters

    // set
    public void setPeso(float peso){
        this.peso = peso;
    }

    // Get
    public float getPeso(){
        return this.peso;
    }

    // get - acessor
    public float getAltura() {
        return this.altura;
    }

    // Set - Modificador
    public void setAltura(float altura) {
        this.altura = altura;
    }
}