import ex15.Veiculo;

public class Exercicio15 {

    public static void executar(){

        Double totalDesconto = 0.0;
        Double totalPago = 0.0;

        while (true) {

            String tipoCombustivel = Prompt.lerLinha("Digite o tipo de combustível (alcool, gasolina e diesel OU 'zero' para encerrar a entrada de dados): ");

            if (tipoCombustivel.equalsIgnoreCase("zero")) {
                break;
            }

            Double valorVeiculo = Prompt.lerDecimal("Digite o valor do veículo: ");

            Veiculo veiculo = new Veiculo(tipoCombustivel, valorVeiculo);

            veiculo.calcularDescontoValorPago();

            totalDesconto += valorVeiculo - (valorVeiculo - veiculo.getDesconto());
            totalPago += veiculo.getValorPago();

            Prompt.imprimir("Valor do desconto: R$" + veiculo.getDesconto());
            Prompt.imprimir("Valor a ser pago: R$" + veiculo.getValorPago());
        }

        Prompt.imprimir("Tota de desconto: R$" + totalDesconto);
        Prompt.imprimir("Total pago pelos clientes: R$" + totalPago);
    }
}
