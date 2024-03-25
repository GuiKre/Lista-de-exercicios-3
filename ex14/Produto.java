package ex14;

public class Produto {

    public Double precoCusto;
    public Double precoVenda;

    public Produto(Double precoCusto, Double precoVenda) {
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
    }

    public String determinarResultado() {
        if (precoVenda > precoCusto) {
            return "Lucro";
        } else if (precoVenda < precoCusto) {
            return "Prejuízo";
        } else {
            return "Empate";
        }
    }

    public Double getPrecoCusto() {
        return precoCusto;
    }
    public Double getPrecoVenda() {
        return precoVenda;
    }
}
