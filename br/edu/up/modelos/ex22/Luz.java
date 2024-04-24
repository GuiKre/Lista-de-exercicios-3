package ex22;

public class Luz {

    private int tipoCliente;
    private Double valorKWh;

    public Luz(int tipoCliente) {
        this.tipoCliente = tipoCliente;
        definirValorKWh();
    }

    private void definirValorKWh() {
        switch (tipoCliente) {
            case 1: valorKWh = 0.60; break;
            case 2: valorKWh = 0.48; break;
            case 3: valorKWh = 1.29; break;
            default: System.out.println("Tipo de cliente inválido.");
        }
    }

    public Double calcularConta(Double consumo) {
        return valorKWh * consumo;
    }

    public int getTipoCliente() {
        return tipoCliente;
    }
    public Double getValorKWh() {
        return valorKWh;
    }
    public void setTipoCliente(int tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
    public void setValorKWh(Double valorKWh) {
        this.valorKWh = valorKWh;
    }
}
