package ex16;

public class Funcionario {

    private Double salario;

    public Funcionario(Double salario) {
        this.salario = salario;
    }

    public Double calcularReajuste(Double salarioMinimo) {
        if (salario < 3 * salarioMinimo) {
            return salario * 0.5;
        } else if (salario >= 3 * salarioMinimo && salario < 10 * salarioMinimo) {
            return salario * 0.2;
        } else if (salario >= 10 * salarioMinimo && salario < 20 * salarioMinimo) {
            return salario * 0.15;
        } else {
            return salario * 0.1;
        }
    }

    public Double getSalario() {
        return salario;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
