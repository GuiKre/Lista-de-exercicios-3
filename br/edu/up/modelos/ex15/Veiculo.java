package ex15;

public class Veiculo {

    private String tipoCombustivel;
    private Double valorVeiculo;
    private Double desconto;
    private Double valorPago;

    public Veiculo(String tipoCombustivel, Double valorVeiculo) {
        this.tipoCombustivel = tipoCombustivel;
        this.valorVeiculo = valorVeiculo;
        this.desconto = 0.0;
        this.valorPago = 0.0;
    }

    public void calcularDescontoValorPago() {
        if (tipoCombustivel.equalsIgnoreCase("alcool")) {
            desconto = valorVeiculo * 0.25;
        } else if (tipoCombustivel.equalsIgnoreCase("gasolina")) {
            desconto = valorVeiculo * 0.21;
        } else if (tipoCombustivel.equalsIgnoreCase("diesel")) {
            desconto = valorVeiculo * 0.14;
        }

        valorPago = valorVeiculo - desconto;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }
    public Double getValorVeiculo() {
        return valorVeiculo;
    }
    public Double getDesconto() {
        return desconto;
    }
    public Double getValorPago() {
        return valorPago;
    }
    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
    public void setValorVeiculo(Double valorVeiculo) {
        this.valorVeiculo = valorVeiculo;
    }
    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }
    public void setValorPago(Double valorPago) {
        this.valorPago = valorPago;
    }
}

