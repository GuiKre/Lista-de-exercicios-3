package ex25;

public class Aluno {

    public String nome;
    public int matricula;
    public Double notaLaboratorio;
    public Double notaAvaliacaoSemestral;
    public Double notaExameFinal;

    public Aluno(String nome, int matricula, Double notaLaboratorio, Double notaAvaliacaoSemestral, Double notaExameFinal) {
        this.nome = nome;
        this.matricula = matricula;
        this.notaLaboratorio = notaLaboratorio;
        this.notaAvaliacaoSemestral = notaAvaliacaoSemestral;
        this.notaExameFinal = notaExameFinal;
    }

    public Double calcularNotaFinal() {
        return (notaLaboratorio * 2 + notaAvaliacaoSemestral * 3 + notaExameFinal * 5) / 10;
    }

    public char calcularClassificacao(Double notaFinal) {
        if (notaFinal >= 8 && notaFinal <= 10) {
            return 'A';
        } else if (notaFinal >= 7 && notaFinal < 8) {
            return 'B';
        } else if (notaFinal >= 6 && notaFinal < 7) {
            return 'C';
        } else if (notaFinal >= 5 && notaFinal < 6) {
            return 'D';
        } else {
            return 'R';
        }
    }

    public String getNome() {
        return nome;
    }
    public int getMatricula() {
        return matricula;
    }
}
