import ex25.Aluno;

public class Exercicio25 {

    public static void executar(){

        String nome = Prompt.lerLinha("Digite o nome do aluno: ");
        int matricula = Prompt.lerInteiro("Digite o número da matrícula do aluno: ");
        Double notaLaboratorio = Prompt.lerDecimal("Digite a nota do trabalho de laboratório: ");
        Double notaAvaliacaoSemestral = Prompt.lerDecimal("Digite a nota da avaliação semestral: ");
        Double notaExameFinal = Prompt.lerDecimal("Digite a nota do exame final: ");

        Aluno aluno = new Aluno(nome, matricula, notaLaboratorio, notaAvaliacaoSemestral, notaExameFinal);

        Double notaFinal = aluno.calcularNotaFinal();

        Prompt.imprimir("Nome do aluno: " + aluno.getNome());
        Prompt.imprimir("Número de matrícula: " + aluno.getMatricula());
        Prompt.imprimir("Nota final: " + aluno.calcularNotaFinal());
        Prompt.imprimir("Classificação: " + aluno.calcularClassificacao(notaFinal));
    }
}
