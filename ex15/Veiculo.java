package ex15;

public class Veiculo {

    public String tipoCombustivel;
    public Double valorVeiculo;
    public Double desconto;
    public Double valorPago;

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

    public Double getDesconto() {
        return desconto;
    }
    public Double getValorPago() {
        return valorPago;
    }
}

