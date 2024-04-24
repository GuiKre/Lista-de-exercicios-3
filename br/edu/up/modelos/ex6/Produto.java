package ex6;

public class Produto {

    private Double precoCusto;
    private Double percentual;

    public Produto(Double precoCusto, Double percentual){
        this.precoCusto = precoCusto;
        this.percentual = percentual;
    }

    public Double calcularPreco(){
        return precoCusto * (1 + percentual / 100);
    }

    public Double getPrecoCusto() {
        return precoCusto;
    }
    public Double getPercentual() {
        return percentual;
    }
    public void setPrecoCusto(Double precoCusto) {
        this.precoCusto = precoCusto;
    }
    public void setPercentual(Double percentual) {
        this.percentual = percentual;
    }
}
