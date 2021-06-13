package com.loja;

public abstract class Jogo implements Itens{

    protected String nome;
    protected int quant_disponivel = 0;
    protected int id_item;
    protected double peso;
    protected int custo_total;
    protected boolean embalado = false;

    public Jogo(String nome){
        this.nome = nome;
    }

    public int getId() {
        return this.id_item;
    }

    public int getCustoTotal() {
        return this.custo_total;
    }

    public double getPeso(){
        return this.peso;
    }

    public boolean getEmbalado(){
        return this.embalado;
    }

    public void setQuantidadeDisponivel(int nova_quant){
        this.quant_disponivel = nova_quant;
    }

    @Override
    public int hashCode(){
       id_item = (nome.length() * 7) + 2;
       return id_item;
    }

    @Override
    public boolean equals(Object o){

        if ((o instanceof Jogo) && ((Jogo) o).getId() == (this.getId()))
        {
            return true;
        }
        else {
            return false;
        }

    }

    @Override
    public String toString(){
        return this.nome + " - " + this.getId();
    }
}
