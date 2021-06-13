package com.loja;

import java.util.HashMap;

public class Loja {

        private int id_item;
        private HashMap<Integer, Jogo> jogo;
        private HashMap<Integer,ItensCustom> item_custom;

        public Loja(){
            HashMap<Integer, Jogo> jogo = new HashMap<Integer, Jogo>();
            //HashMap<Integer,ItensCustom> this.item_custom = new HashMap<Integer, ItensCustom>();
        }

        public int cadastraJogoCarta(String nome, int quant_cartas, int custo_cartas){
            Jogo novacarta = new Carta(nome, quant_cartas, custo_cartas);
            id_item = novacarta.getId();
            jogo.put(id_item, novacarta);

            return id_item;
        }

        public int cadastraJogoTabuleiro(String nome, int quant_pecas, int custo_peca, int peso_medio_peca, int quant_itens_extras){
            Jogo novotabuleiro = new Tabuleiro(nome, quant_pecas, custo_peca, peso_medio_peca, quant_itens_extras);
            id_item = novotabuleiro.getId();
            jogo.put(id_item, novotabuleiro);

            return id_item;
        }

        public int cadastraItemCustom(String descricao, int peso, int custo){
            ItensCustom novoitem = new ItensCustom(descricao,peso,custo);
            id_item = novoitem.getId();
            item_custom.put(id_item, novoitem);

            return id_item;
        }

        public void alteraCustoItemCustom(int id, int novo_custo){
            if(item_custom.containsKey(id)){
                ItensCustom item = item_custom.get(id);
                item.setCusto(novo_custo);
                item_custom.replace(id, item);
            }
        }

        public void alteraPesoItemCustom(int id, int novo_peso) {
            if (item_custom.containsKey(id)) {
                ItensCustom item = item_custom.get(id);
                item.setPeso(novo_peso);
                item_custom.replace(id, item);
            }
        }

        public void alteraQuantidadeDisponivel(int id, int nova_quant){
            if(item_custom.containsKey(id)){
                ItensCustom item = item_custom.get(id);
                item.setQuantidadeDisponivel(nova_quant);
                item_custom.replace(id, item);
        }
            else{
                if(jogo.containsKey(id)){
                    Jogo item_jogo = jogo.get(id);
                    item_jogo.setQuantidadeDisponivel(nova_quant);
                    jogo.replace(id, item_jogo);
                }
            }
        }

        public String exibeItem(int id) {
            if (item_custom.containsKey(id)) {
                ItensCustom item = item_custom.get(id);
                return item.toString() + "\n" + item.getPeso() + " - " + item.getCustoTotal();
            } else {
                if (jogo.containsKey(id)) {
                    Jogo item_jogo = jogo.get(id);
                    return item_jogo.toString() + "\n" + item_jogo.getPeso() + " - " + item_jogo.getCustoTotal();
                }
            }
            return "NÃO HÁ ITENS COM ESTE ID!";
        }



}
