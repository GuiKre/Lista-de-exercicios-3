import ex10.Pessoa;

public class Exercicio10 {

    public static void executar(){

        // Leitura da quantidade de pessoas
        int numPessoas = Prompt.lerInteiro("Digite o número de pessoas: ");
        
        // Leitura da idade de cada pessoa e verificação
        for (int i = 1; i <= numPessoas; i++) {
            int idade = Prompt.lerInteiro("Digite a idade da pessoa " + i + ": ");

            Pessoa pessoa = new Pessoa(idade);

            Prompt.imprimir(pessoa.verificarIdade());
            Prompt.linhaEmBranco();
        }
    }
}
