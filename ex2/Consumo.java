package ex2;

public class Consumo {

    public Double distanciatotal;
    public Double combustivelgasto;

    public Consumo(Double distanciatotal, Double combustivelgasto){
        this.distanciatotal = distanciatotal;
        this.combustivelgasto = combustivelgasto;
    }

    public Double calcularConsumo(){
        return distanciatotal/combustivelgasto;
    }
}
