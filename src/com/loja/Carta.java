package com.loja;

public class Carta extends Jogo implements Itens {

    private String nome;
    private int quant_disponivel;
    private int id_item;
    private double peso;
    private int custo_total;
    private boolean embalado;
    
    public Carta(String nome, int quant_cartas, int custo_cartas) {
        super(nome);
        this.nome = nome;
        calculaCustoTotal(quant_cartas, custo_cartas);
        calculaPeso(quant_cartas);
    }

    private void calculaCustoTotal(int quant_cartas, int custo_cartas) {
        this.custo_total= quant_cartas * custo_cartas;
    }

    private void calculaPeso(int quant_cartas){
        this.peso =  (quant_cartas * 1.5) + 100;
    }

    public int getId(){
        return this.id_item;
    }

    public int getCustoTotal(){
        return this.custo_total;
    }

    public void setPeso(int peso){
        this.peso = peso;
    }

    public void setCusto_total(int custo_total){
        this.custo_total = custo_total;
    }

    public void setEmbalado(boolean embalado){
        this.embalado = embalado;
    }

    public double getPeso(){
        return this.peso;
    }

    public void setQuantidadeDisponivel(int nova_quant){
        this.quant_disponivel = nova_quant;
    }
    public int hashCode() {
        this.id_item = super.hashCode();
        return id_item;
    }

    public boolean equals(Object o) {
        return super.equals(o);
    }

    public String toString(){
        return super.toString();
    }
}
