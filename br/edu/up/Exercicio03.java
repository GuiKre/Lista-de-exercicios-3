import ex3.Vendedor;

public class Exercicio03 {

    public static void executar(){

        String nome = Prompt.lerLinha("Digite o nome do vendedor: ");
        Double salariofixo = Prompt.lerDecimal("Digite o salário fixo do vendedor: ");
        Double totalvendas = Prompt.lerDecimal("Digite o total de vendas efetuadas pelo vendedor no mês em dinheiro: ");

        Vendedor vendedor = new Vendedor(nome, salariofixo, totalvendas);

        Prompt.imprimir("Nome do vendedor: " + vendedor.getNome());
        Prompt.imprimir("Salário fixo do vendedor: R$" + vendedor.getSalariofixo());
        Prompt.imprimir("Salário no final do mês do vendedor: R$" + vendedor.calcularSalarioTotal());
    }
}
