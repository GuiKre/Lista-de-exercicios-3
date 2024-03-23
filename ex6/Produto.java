package ex6;

public class Produto {

    public Double precoCusto;
    public Double percentual;

    public Produto(Double precoCusto, Double percentual){
        this.precoCusto = precoCusto;
        this.percentual = percentual;
    }

    public Double calcularPreco(){
        return precoCusto * (1 + percentual / 100);
    }
}
