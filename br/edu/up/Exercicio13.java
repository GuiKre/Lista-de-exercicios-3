import ex13.Pessoa;

public class Exercicio13 {

    public static void executar(){

        int totalAptos = 0;
        int totalHomens = 0;
        int totalMulheres = 0;

        int numeroPessoas = Prompt.lerInteiro("Digite o número de pessoas: ");

        for (int i = 1; i <= numeroPessoas; i++) {
            Prompt.imprimir("Dados da pessoa " + i + ": ");
            String nome = Prompt.lerLinha("Nome: ");

            char sexo = Prompt.lerCaractere("Sexo (M/F): ");

            int idade = Prompt.lerInteiro("Idade: ");

            char saude = Prompt.lerCaractere("Saúde (S/N): ");

            Pessoa pessoa = new Pessoa(nome, sexo, idade, saude);

            if (pessoa.getIdade() >= 18 && (pessoa.getSaude() == 'S' || pessoa.getSaude() == 's')) {
                totalAptos++;
            }

            if (pessoa.getSexo() == 'M' || pessoa.getSexo() == 'm') {
                totalHomens++;
            } else {
                totalMulheres++;
            }
        }

        Prompt.imprimir("Total de pessoas aptas para o serviço militar: " + totalAptos);
        Prompt.imprimir("Total de homens: " + totalHomens);
        Prompt.imprimir("Total de mulheres: " + totalMulheres);
    }
}
