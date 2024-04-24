import ex26.Pretendente;

public class Exercicio26 {

    public static void executar(){

        String nome = Prompt.lerLinha("Digite o nome do pretendente: ");
        int idade = Prompt.lerInteiro("Digite a idade do pretendente: ");
        int grupoRisco = Prompt.lerInteiro("Digite o grupo de risco do pretendente (1 - baixo, 2 - Médio, 3 - Alto): ");

        Pretendente pretendente = new Pretendente(nome, idade, grupoRisco);

        Prompt.imprimir(pretendente.determinarCategoriaSeguro());
    }
}
