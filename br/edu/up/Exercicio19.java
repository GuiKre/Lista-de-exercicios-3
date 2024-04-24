import ex19.Triangulo;

public class Exercicio19 {

    public static void executar(){

        int lado1 = Prompt.lerInteiro("Digite o primeiro lado do triângulo: ");
        int lado2 = Prompt.lerInteiro("Digite o segundo lado do triângulo: ");
        int lado3 = Prompt.lerInteiro("Digite o terceiro lado do triângulo: ");

        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);

        if (triangulo.formaTriangulo()) {
            Prompt.imprimir("Os lados formam um triângulo: " + triangulo.tipoTriangulo());
        } else {
            Prompt.imprimir("Os lados não formam um triângulo, pois um dos comprimentos de um dos lados é maior que a soma dos outros dois.");
        }
    }
}
