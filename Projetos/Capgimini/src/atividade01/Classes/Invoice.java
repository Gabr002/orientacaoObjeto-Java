package atividade01.Classes;

import java.lang.reflect.Constructor;

public class Invoice {
    private int idItem;
    private String descricao;
    private int quantidade;
    private float precoUnitario;

    public Invoice(int idItem, String descricao, int quantidade, float precoUnitario) {
        this.setIdItem(idItem);
        this.setDescricao(descricao);
        this.setQuantidade(quantidade);
        this.setPrecoUnitario(precoUnitario);

    }
    public double getInvoiceAmount(){
        return quantidade * precoUnitario;
    }

    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if(quantidade <= 0){
            this.quantidade = quantidade * 0;
        }else{
            this.quantidade = quantidade;
        }
    }

    public float getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(float precoUnitario) {
        if(precoUnitario < 0){
            this.precoUnitario = 0;
        } else {
            this.precoUnitario = precoUnitario;
        }
    }
    
    
}
