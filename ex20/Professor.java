package ex20;

public class Professor {

    public int nivel;
    public Double valorHoraAula;

    public Professor(int nivel) {
        this.nivel = nivel;
        definirValorHoraAula();
    }

    private void definirValorHoraAula() {
        switch (nivel) {
            case 1: valorHoraAula = 12.0; break;
            case 2: valorHoraAula = 17.0; break;
            case 3: valorHoraAula = 25.0; break;
            default: System.out.println("Nível de professor inválido.");
        }
    }

    public Double calcularSalario(int horasTrabalhadas) {
        return valorHoraAula * horasTrabalhadas;
    }
}
