import ex22.Luz;

public class Exercicio22 {

    public static void executar(){

        int tipoCliente = Prompt.lerInteiro("Digite o tipo de cliente 1(residência), 2(comércio) ou 3(industria): ");
        Double consumo = Prompt.lerDecimal("Digite o consumo de energia em KW/h");
  
        Luz luz = new Luz(tipoCliente);

        Prompt.imprimir("Valor da conta de luz: R$" + luz.calcularConta(consumo));
    }
}
