package Entidades;

public class Produto {
    private int codigo;
    private String nome;
    private float valor;
    private Fornecedor fornecedor;
    
    
    public Produto() {
    }


    public Produto(int codigo, String nome, float valor, Fornecedor fornecedor) {
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
        this.fornecedor = fornecedor;
    }

    public boolean atualizarPreco (float valorPor, float acrescimo){
        acrescimo = valorPor/100;
        if (valorPor > 0){   
            valorPor += (valorPor*acrescimo);
            return true;
        } else{
            return false;
        }
        
    }


    public int getCodigo() {
        return codigo;
    }


    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public Float getValor() {
        return valor;
    }


    public void setValor(Float valor) {
        this.valor = valor;
    }


    public Fornecedor getFornecedor() {
        return fornecedor;
    }


    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
    

}
    

    
