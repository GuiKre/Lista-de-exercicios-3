import ex2.Consumo;

public class Exercicio02 {

    public static void executar(){

        Double distanciatotal = Prompt.lerDecimal("Digite a distância total percorrida pelo automóvel em quilômetros: ");
        Double combustivelgasto = Prompt.lerDecimal("Digite o total de combustível gasto pelo automóvel em litros: ");

        Consumo consumo = new Consumo(distanciatotal, combustivelgasto);

        Prompt.imprimir("Consumo médio do automóvel: " + consumo.calcularConsumo());
    }
}
