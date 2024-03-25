import ex17.Empresa;
import ex17.Funcionario;

public class Exercicio17 {

    public static void executar(){

        String nome = Prompt.lerLinha("Digite o nome do funcionário: ");
        Double salario = Prompt.lerDecimal("Digite o salário do funcionário: ");
        Double salarioMinimo = Prompt.lerDecimal("Digite o valor do salário mínimo: ");

        Funcionario funcionario = new Funcionario(nome, salario);

        Empresa empresa = new Empresa(salarioMinimo);

        Double reajuste = empresa.calcularReajuste(funcionario, salarioMinimo);
        Double novoSalario = funcionario.getSalario() + reajuste;

        Prompt.imprimir("Nome do funcionário: " + funcionario.getNome());
        Prompt.imprimir("Reajuste: R$" + reajuste);
        Prompt.imprimir("Novo salário: R$" + novoSalario);

        Prompt.imprimir("Aumento na folha de pagamento da empresa: R$" + empresa.getAumentoFolha());
    }
}
