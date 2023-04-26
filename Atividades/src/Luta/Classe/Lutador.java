package Luta.Classe;

public class Lutador {
    // Atriutos
    private String nome;
    private String nacionalidade;
    private int idade;
    private Double altura;
    private Double peso;
    private String categoria;
    private int vitorias, derrotas, empates;
    
    // Métodos Públicos
    public void apresentar(){
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Origem: " + this.getNacionalidade());
        System.out.println(this.getIdade() + " anos");
        System.out.println(this.getAltura() + "m de altura");
        System.out.println("Pesando: " + this.getPeso());
        System.out.println("Ganhou: " + this.getVitorias());
        System.out.println("Perdeu: " + this.getDerrotas());
        System.out.println("Empates: " + this.getDerrotas());
    }
    public void Status(){
        System.out.println(getNome());
        System.out.println("é um peso " + this.getCategoria());
        System.out.println(this.getVitorias() + " Vitórias");
        System.out.println(this.getDerrotas() + " Derrotas");
        System.out.println(this.getEmpates() + " Empates");
    }
    public void ganharLuta(){
        setVitorias(this.getVitorias() + 1);
    }
    public void perderLuta(){
        setDerrotas(this.getDerrotas() + 1);
    }
    public void empatarLuta(){
        setEmpates(this.getEmpates() + 1);
    }

    // Constructor
    public Lutador(String no, String na, int id, double al, double pe, int vi, int de, int em) {
        this.setNome(no);
        this.setNacionalidade(na);
        this.setIdade(id);
        this.setAltura(al);
        this.setPeso(pe);
        this.setVitorias(vi);
        this.setDerrotas(de);
        this.setEmpates(em);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(peso < 52.2)
            this.categoria = "Inválido";
        else if(peso  <= 70.3)
            this.categoria = "Leve";
        else if(peso <= 83.9)
            this.categoria = "Médio";
        else if(peso <= 120.2)
            this.categoria = "Pesado";
        else 
            this.categoria = "Inválido";    
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }       

    
}
