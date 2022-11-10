package Entidades;

import java.util.ArrayList;

public class ConjuntoProdutos{

    ArrayList<Produto> produtos = new ArrayList<Produto>();

    public String incluirItems(){

      this.produtos.add(produtos);
      final String addLista = incluirItems();
        return addLista;
    }

      public String removerItems(){
      this.produtos.remove(produtos);
      final String addLista = incluirItems();
        return addLista;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public static void incluirItems(Object addLista) {
    }
}