import ex7.Carro;

public class Exercicio07 {

    public static void executar(){

        Double custoFabrica = Prompt.lerDecimal("Digite o custo de fábrica do carro: ");

        Carro carro = new Carro(custoFabrica);

        Prompt.imprimir("O custo final ao consumidor é: R$" + carro.calcularCustoFinal());
    }
}
