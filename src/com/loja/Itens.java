package com.loja;

public interface Itens {

    public int getId();
    public int getCustoTotal();
    public double getPeso();
    public boolean getEmbalado();
    public void setQuantidadeDisponivel(int nova_quantidade);
    public int hashCode();
    public String toString();

}
