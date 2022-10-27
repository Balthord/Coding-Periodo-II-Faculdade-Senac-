package AulaJAVA.Entidades;

public class Endereco {
    private String uf;
    private String cidade;
    private String bairro;
    private String rua;
    private int numero;
    private String comp;
    private String cep;

    public Endereco(String uf,String cidade,String bairro,String rua,int numero,String comp,String cep ){
        this.uf=uf;
        this.cidade=cidade;
        this.bairro=bairro;
        this.rua=rua;
        this.numero=numero;
        this.comp=comp;
        this.cep=cep;
    }
       
    

}