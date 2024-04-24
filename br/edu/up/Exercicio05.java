import ex5.Compra;

public class Exercicio05 {

    public static void executar(){

        Double valor = Prompt.lerDecimal("Digite o valor da compra efetuada: ");

        Compra compra = new Compra(valor);

        Prompt.imprimir("Valor de cada prestação: R$" + compra.calcularPrestação());
    }
}
