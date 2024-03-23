package ex5;

public class Compra {

    public Double valor;

    public Compra(Double valor){
        this.valor = valor;
    }

    public Double calcularPrestação(){
        return valor / 5;
    }
}
