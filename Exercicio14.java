import ex14.Produto;

public class Exercicio14 {

    public static void executar(){

        Double somaPrecoCusto = 0.0;
        Double somaPrecoVenda = 0.0;

        for (int i = 1; i <= 5; i++) {
            Double precoCusto = Prompt.lerDecimal("Digite o preço de custo do produto " + i + ": ");
            Double precoVenda = Prompt.lerDecimal("Digite o preço de venda do produto " + i + ": ");
            
            Produto produto = new Produto(precoCusto, precoVenda);
            
            Prompt.imprimir("Resultado de venda do produto " + i + ": " + produto.determinarResultado());
            
            somaPrecoCusto += produto.getPrecoCusto();
            somaPrecoVenda += produto.getPrecoVenda();
        }
        
        Double mediaPrecoCusto = somaPrecoCusto / 5;
        Double mediaPrecoVenda = somaPrecoVenda / 5;
        
        Prompt.imprimir("Média do preço de custo dos produtos: " + mediaPrecoCusto);
        Prompt.imprimir("Média do preço de venda dos produtos: " + mediaPrecoVenda);
    }
}
