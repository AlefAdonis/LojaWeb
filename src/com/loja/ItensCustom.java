package com.loja;

import java.util.Objects;

public class ItensCustom implements Itens{

    private String descricao;
    private int peso;
    private int custo;
    private int id_item;
    private int quant_disponivel = 0;
    private boolean embalado = false;

    public ItensCustom(String descricao, int peso, int custo){
        this.descricao = descricao;
        this.peso = peso;
        this.custo = custo;
    }
    @Override
    public int getId() {
        return this.id_item;
    }

    @Override
    public int getCustoTotal() {
        return this.custo;
    }

    @Override
    public double getPeso() {
        return this.peso;
    }

    @Override
    public boolean getEmbalado() {
        return this.embalado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItensCustom item = (ItensCustom) o;
        return peso == item.peso && custo == item.custo && id_item == item.id_item && Objects.equals(descricao, item.descricao);
    }

    @Override
    public int hashCode() {
        this.id_item = Objects.hash(peso, custo, id_item);
        return this.id_item;
    }

    @Override
    public String toString(){
        return descricao + " " + id_item;
    }

    public void setCusto(int novo_custo){
        this.custo = novo_custo;
    }

    public void setPeso(int novo_peso) {
        this.peso = novo_peso;
    }

    public void setQuantidadeDisponivel(int nova_quant){
        this.quant_disponivel= nova_quant;
    }
}
