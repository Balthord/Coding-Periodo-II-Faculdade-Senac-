package Exercicio02_Java;

public class Homem extends PessoaIMC {
    @Override
    public String reusultIMC() {
        return avaliar(null);
    }
    
    public Homem(String nome, String dataNascimento, double altura, double peso){
        super(nome, dataNascimento, altura, peso);
    }

    public String avaliar(Homem homem) {
        double imc =calculaIMC(homem);
        if (imc > 26.4) {
            return "Acima do peso ideal";
        }
        if (imc > 20.7) {
            return "Peso ideal";
        }
        return "Abaixo do peso ideal";
        }
}

   
    