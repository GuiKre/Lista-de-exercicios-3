package ex24;

public class Aluno {

    private Double notaLaboratorio;
    private Double notaAvaliacaoSemestral;
    private Double notaExameFinal;

    public Aluno(Double notaLaboratorio, Double notaAvaliacaoSemestral, Double notaExameFinal) {
        this.notaLaboratorio = notaLaboratorio;
        this.notaAvaliacaoSemestral = notaAvaliacaoSemestral;
        this.notaExameFinal = notaExameFinal;
    }

    public Double calcularMediaPonderada() {
        Double mediaPond = (notaLaboratorio * 2 + notaAvaliacaoSemestral * 3 + notaExameFinal * 5) / 10;
        return mediaPond;
    }

    public Double getNotaLaboratorio() {
        return notaLaboratorio;
    }
    public Double getNotaAvaliacaoSemestral() {
        return notaAvaliacaoSemestral;
    }
    public Double getNotaExameFinal() {
        return notaExameFinal;
    }
    public void setNotaLaboratorio(Double notaLaboratorio) {
        this.notaLaboratorio = notaLaboratorio;
    }
    public void setNotaAvaliacaoSemestral(Double notaAvaliacaoSemestral) {
        this.notaAvaliacaoSemestral = notaAvaliacaoSemestral;
    }
    public void setNotaExameFinal(Double notaExameFinal) {
        this.notaExameFinal = notaExameFinal;
    }
}
