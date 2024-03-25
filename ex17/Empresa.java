package ex17;

public class Empresa {

    public Double aumentoFolha;

    public Empresa(Double aumentoFolha){
        this.aumentoFolha = aumentoFolha;
    }

    public Double calcularReajuste(Funcionario funcionario, Double salarioMinimo) {
        Double reajuste;
        if (funcionario.getSalario() < 3 * salarioMinimo) {
            reajuste = funcionario.getSalario() * 0.5;
        } else if (funcionario.getSalario() >= 3 * salarioMinimo && funcionario.getSalario() < 10 * salarioMinimo) {
            reajuste = funcionario.getSalario() * 0.2;
        } else if (funcionario.getSalario() >= 10 * salarioMinimo && funcionario.getSalario() < 20 * salarioMinimo) {
            reajuste = funcionario.getSalario() * 0.15;
        } else {
            reajuste = funcionario.getSalario() * 0.1;
        }
        aumentoFolha += reajuste;
        return reajuste;
    }

    public Double getAumentoFolha() {
        return aumentoFolha;
    }
}
