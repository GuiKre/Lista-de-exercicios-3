package ex4;

public class ConversorMoeda {

    public Double cotacao;
    public Double dollar;

    public ConversorMoeda(Double cotacao, Double dollar){
        this.cotacao = cotacao;
        this.dollar = dollar;
    }

    public Double calcularCotação(){
        return dollar * cotacao;
    }

}
