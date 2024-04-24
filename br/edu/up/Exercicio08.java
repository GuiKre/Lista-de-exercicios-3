import ex8.Aluno;

public class Exercicio08 {

    public static void executar(){

       String nome = Prompt.lerLinha("Digite o nome do aluno: ");
       Double nota1 = Prompt.lerDecimal("Digite a primeira nota do aluno: ");
       Double nota2 = Prompt.lerDecimal("Digite a segunda nota do aluno: ");
       Double nota3 = Prompt.lerDecimal("Digite a terceira nota do aluno: ");
       
       Aluno aluno = new Aluno(nome, nota1, nota2, nota3);

       Prompt.imprimir("Nome: " + aluno.getNome());
       Prompt.imprimir("Média: " + aluno.calcularMedia());
       Prompt.imprimir("Situação: " + aluno.situaçãoAluno());
    }
}
