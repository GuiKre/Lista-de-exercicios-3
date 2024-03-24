package ex10;

public class Pessoa {

    public int idade;

    public Pessoa(int idade){
        this.idade = idade;
    }

    public String verificarIdade() {
        if (idade >= 18) {
            return "Maior de idade";
        } else if (idade < 18 && idade >=0) {
            return "Menor de idade";
        } else {
            return "Idade inválida";
        }
    }
}
