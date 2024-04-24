package ex2;

public class Consumo {

    private Double distanciatotal;
    private Double combustivelgasto;

    public Consumo(Double distanciatotal, Double combustivelgasto){
        this.distanciatotal = distanciatotal;
        this.combustivelgasto = combustivelgasto;
    }

    public Double calcularConsumo(){
        return distanciatotal/combustivelgasto;
    }

    public Double getDistanciatotal() {
        return distanciatotal;
    }
    public Double getCombustivelgasto() {
        return combustivelgasto;
    }
    public void setDistanciatotal(Double distanciatotal) {
        this.distanciatotal = distanciatotal;
    }
    public void setCombustivelgasto(Double combustivelgasto) {
        this.combustivelgasto = combustivelgasto;
    }
}
