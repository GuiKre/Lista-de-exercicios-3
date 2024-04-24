import ex11.Pessoa;

public class Exercicio11 {

    public static void executar(){

        int homens = 0;
        int mulheres = 0;
        int indefinido = 0;

        for (int i = 1; i <= 56; i++) {
            String nome = Prompt.lerLinha("Digite o nome da pessoa " + i + ": ");
            
            char sexo = Prompt.lerCaractere("Digite o sexo da pessoa" + i + " (M/F): ");
            
            Pessoa pessoa = new Pessoa(nome, sexo);

            if (sexo == 'M' || sexo == 'm') {
                homens++;
            } else if (sexo == 'F' || sexo == 'f') {
                mulheres++;
            } else {
                indefinido++;
            } 

            Prompt.imprimir("Nome: " + pessoa.getNome() + ", Sexo: " + pessoa.sexo());
        }

        Prompt.imprimir("Total de homens: " + homens);
        Prompt.imprimir("Total de mulheres: " + mulheres);
        Prompt.imprimir("Indefinido: " + indefinido);
    }
}
