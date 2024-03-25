package ex17;

public class Funcionario {

    public String nome;
    public Double salario;

    public Funcionario(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }
    public double getSalario() {
        return salario;
    }

    public void setSalario(Double novoSalario) {
        salario = novoSalario;
    }
}
