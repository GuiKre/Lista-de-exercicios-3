import ex23.Pessoa;

public class Exercicio23 {

    public static void executar(){

        String nome = Prompt.lerLinha("Digite o nome da pessoa: ");
        char sexo = Prompt.lerCaractere("Digite o sexo da pessoa (M/F): ");
        Double altura = Prompt.lerDecimal("Digite a altura da pessoa em metros: ");
        int idade = Prompt.lerInteiro("Digite a idade da pessoa: ");
 
        Pessoa pessoa = new Pessoa(nome, sexo, altura, idade);
 
         Prompt.imprimir("Nome: " + pessoa.getNome());
         Prompt.imprimir("Peso ideal: " + pessoa.calcularPesoIdeal() + "Kg");
    }
}
