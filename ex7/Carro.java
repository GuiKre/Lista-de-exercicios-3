package ex7;

public class Carro {

    public Double custoFabrica;

    public Carro(Double custoFabrica){
        this.custoFabrica = custoFabrica;
    }
    public Double calcularCustoFinal(){
        Double imposto = custoFabrica * 0.45;
        Double custoImposto = custoFabrica + imposto;
        Double distribuidor = custoImposto * 0.28;
        return custoImposto + distribuidor;
    }
}
