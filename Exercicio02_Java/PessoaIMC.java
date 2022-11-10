package Exercicio02_Java;


public abstract class PessoaIMC extends Pessoa{
        protected double altura;
        protected double peso;

    public PessoaIMC(String nome, String dataNascimento, double altura, double peso) {
        super(nome, dataNascimento);
        this.altura = altura;
        this.peso = peso;
    }

  public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public double calculaIMC(PessoaIMC pessoa) {
        double peso = pessoa.getPeso();
        double altura = pessoa.getAltura();
        return peso / (altura * altura);
    }
   
    public abstract String reusultIMC();

    public String toString() {
        return "Nome: " +nome+ 
                "\nData de Nascimento:" +dataNascimento+
                "\nPeso: "+peso+
                "\nAltura: " +altura ;  
    }
}
