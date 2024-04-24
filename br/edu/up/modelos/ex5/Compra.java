package ex5;

public class Compra {

    private Double valor;

    public Compra(Double valor){
        this.valor = valor;
    }

    public Double calcularPrestação(){
        return valor / 5;
    }

    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
}
