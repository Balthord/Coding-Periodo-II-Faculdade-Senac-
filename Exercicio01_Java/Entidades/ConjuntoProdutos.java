package Entidades;
import java.util.ArrayList;

public class ConjuntoProdutos { 
    public static void main (String[] args){
        ArrayList<Produto> Conjunto_Produtos = new ArrayList <>();
        
        Fornecedor forn1 = new Fornecedor ("1234321","978787887","Zé Maria");

        Produto produto1 = new Produto (1,"TV LCD",3500,forn1);
 
        Fornecedor forn2 = new Fornecedor ("543212345","8132314545","Cláudio");
 
        Produto produto2 = new Produto (2,"notebook",2000, forn2);
 
        Produto produto3 = new Produto (3,"impressora",232, forn2); 
        
        Conjunto_Produtos.add(produto1);
        Conjunto_Produtos.add(produto2);
        Conjunto_Produtos.add(produto3);

        for (Produto objetoConjunto : Conjunto_Produtos) {
            System.out.println("Nome:  "+ objetoConjunto.getNome() + "  Valor: " +objetoConjunto.getValor());
        }
        
        Conjunto_Produtos.remove(produto3);
    
        

    }
}

