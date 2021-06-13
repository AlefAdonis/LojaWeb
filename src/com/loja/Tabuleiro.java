package com.loja;

public class Tabuleiro extends Jogo implements Itens  {

    private String nome;
    private int quant_disponivel;
    private int id_item;
    private int custo_total;
    private double peso;
    private boolean embalado;

    public Tabuleiro(String nome, int quant_pecas, int custo_peca, int peso_medio_peca, int quant_itens_extras) {
        super(nome);
        this.calculaCustoTotal(quant_pecas, quant_itens_extras);
        this.calculaPeso(quant_pecas, peso_medio_peca,quant_itens_extras);
    }

    private void calculaPeso(int quant_pecas, int peso_medio_peca, int quant_itens_extras) {
        this.peso = (quant_pecas * peso_medio_peca) + (10*quant_itens_extras);
    }

    private void calculaCustoTotal(int quant_pecas,int quant_itens_extras){
        this.custo_total = 50 + (10 * (quant_pecas)) + (5 * quant_itens_extras);
    }

    @Override
    public int getId() {
        return this.id_item;
    }

    @Override
    public int getCustoTotal() {
        return this.custo_total;
    }

    @Override
    public double getPeso() {
        return this.peso;
    }

    @Override
    public boolean getEmbalado() {
        return false;
    }

    public void setQuantidadeDisponivel(int nova_quant){
        this.quant_disponivel = nova_quant;
    }

    public int hashCode(){
        return super.hashCode();
    }

    public boolean equals(Object o){
        return super.equals(o);
    }

    public String toString(){
        return super.toString();
    }
}

