import ex9.Contador;

public class Exercicio09 {

    public static void executar(){

        Double[] numeros = new Double[80];

        for(int i = 0; i < numeros.length; i++){
            numeros[i] = Prompt.lerDecimal("Digite um número: ");
        }

        int intervalo = Contador.numerosIntervalo(numeros);

        Prompt.imprimir("Quantidade de números entre 10 e 150: " + intervalo);
    }
}
