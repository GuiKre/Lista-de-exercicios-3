import ex21.Nadador;

public class Exercicio21 {

    public static void executar(){

        int idade = Prompt.lerInteiro("Digite a idade do nadador: ");

        Nadador nadador = new Nadador(idade);

        Prompt.imprimir("Categoria: " + nadador.classificarCategoria());
    }
}
