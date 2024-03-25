import ex24.Aluno;

public class Exercicio24 {

    public static void executar(){

        Double notaLaboratorio = Prompt.lerDecimal("Digite a nota do trabalho de laboratório: ");
        Double notaAvaliacaoSemestral = Prompt.lerDecimal("Digite a nota da avaliação semestral: ");
        Double notaExameFinal = Prompt.lerDecimal("Digite a nota do exame final: ");
 
        Aluno aluno = new Aluno(notaLaboratorio, notaAvaliacaoSemestral, notaExameFinal);
 
        Prompt.imprimir("Média ponderada: " + aluno.calcularMediaPonderada());
    }
}
