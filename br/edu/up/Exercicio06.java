import ex6.Produto;

public class Exercicio06 {

    public static void executar(){

        Double precoCusto = Prompt.lerDecimal("Digite o preço de custo do produto: ");
        Double percentual = Prompt.lerDecimal("Digite o percentual de lucro(%):");

        Produto produto = new Produto(precoCusto, percentual);

        Prompt.imprimir("Preço de venda: R$" + produto.calcularPreco());
    }
}
