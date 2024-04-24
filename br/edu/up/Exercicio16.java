import ex16.Funcionario;

public class Exercicio16 {

    public static void executar(){

        Double salarioMinimo = Prompt.lerDecimal("Digite o valor do salário mínimo: ");

        Prompt.imprimir("Digite o salário de cada funcionário: ");
        Double[] salarios = new Double[584];
        for (int i = 0; i < salarios.length; i++) {
            salarios[i] = Prompt.lerDecimal("Salário do funcionário " + (i + 1) + ": ");
        }

        for (int i = 0; i < salarios.length; i++) {
            Funcionario funcionario = new Funcionario(salarios[i]);
            Double reajuste = funcionario.calcularReajuste(salarioMinimo);

            Prompt.separador();
            Prompt.imprimir("Funcionário " + (i + 1) + ": \nSalário original: R$" + funcionario.getSalario() + " \nReajuste: R$" + reajuste + " \nNovo salário: R$" + (funcionario.getSalario() + reajuste));
        }
    }
}
