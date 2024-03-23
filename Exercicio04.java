import ex4.ConversorMoeda;

public class Exercicio04 {

    public static void executar(){

        Double cotacao = Prompt.lerDecimal("Digite a cotação do dollar atual em reais: ");
        Double dollar = Prompt.lerDecimal("Digite a quantidade de dollares que deseja fazer a conversão: ");

        ConversorMoeda conversor = new ConversorMoeda(cotacao, dollar);

        Prompt.imprimir("Valor convertido em reais: R$" + conversor.calcularCotação());
    }
}
