package Exercicio02_Java;

public class Mulher extends PessoaIMC{
    @Override
    public String reusultIMC() {
        return avaliar(null) ;
    }
    
    public Mulher(String nome, String dataNascimento, double altura, double peso){
        super(nome, dataNascimento, altura, peso);
    }

    public String avaliar(Mulher mulher) {
        double imc = calculaIMC(mulher);
        if (imc > 25.8) {
            return "Acima do peso ideal";
        }
        if (imc > 19) {
            return "Peso ideal";
        }
        return "Abaixo do peso ideal";
    }

    
}

