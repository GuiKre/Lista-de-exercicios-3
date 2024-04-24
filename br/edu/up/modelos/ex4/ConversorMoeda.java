package ex4;

public class ConversorMoeda {

    private Double cotacao;
    private Double dollar;

    public ConversorMoeda(Double cotacao, Double dollar){
        this.cotacao = cotacao;
        this.dollar = dollar;
    }

    public Double calcularCotação(){
        return dollar * cotacao;
    }

    public Double getCotacao() {
        return cotacao;
    }
    public Double getDollar() {
        return dollar;
    }
    public void setCotacao(Double cotacao) {
        this.cotacao = cotacao;
    }
    public void setDollar(Double dollar) {
        this.dollar = dollar;
    }
}
