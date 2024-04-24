import ex20.Professor;

public class Exercicio20 {

    public static void executar(){

        int nivel = Prompt.lerInteiro("Digite o nível do professor (1, 2 ou 3): ");
        int horasTrabalhadas = Prompt.lerInteiro("Digite a quantidade de horoas trabalhadas: ");

        Professor professor = new Professor(nivel);

        Prompt.imprimir("o salário do professor é: R$" + professor.calcularSalario(horasTrabalhadas));
    }
}
