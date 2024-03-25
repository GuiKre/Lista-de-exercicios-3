package ex24;

public class Aluno {

    public Double notaLaboratorio;
    public Double notaAvaliacaoSemestral;
    public Double notaExameFinal;

    public Aluno(Double notaLaboratorio, Double notaAvaliacaoSemestral, Double notaExameFinal) {
        this.notaLaboratorio = notaLaboratorio;
        this.notaAvaliacaoSemestral = notaAvaliacaoSemestral;
        this.notaExameFinal = notaExameFinal;
    }

    public Double calcularMediaPonderada() {
        Double mediaPond = (notaLaboratorio * 2 + notaAvaliacaoSemestral * 3 + notaExameFinal * 5) / 10;
        return mediaPond;
    }
}
