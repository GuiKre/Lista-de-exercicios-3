import ex18.Funcionario;

public class Exercicio18 {

    public static void executar(){

        String nome = Prompt.lerLinha("Digite o nome do funcionário: ");
        int idade = Prompt.lerInteiro("Digite a idade do funcionário: ");
        char sexo = Prompt.lerCaractere("Digite o sexo do funcionário (M/F): ");
        Double salarioFixo = Prompt.lerDecimal("Digite o salário fixo do funcionário: ");
 
        Funcionario funcionario = new Funcionario(nome, idade, sexo, salarioFixo);
 
        Prompt.linhaEmBranco();
        Prompt.imprimir("Nome do funcionário: " + funcionario.getNome());
        Prompt.imprimir("Salário líquido acrescido do abono: R$" + funcionario.calcularSalarioLiquido());
    }
}
