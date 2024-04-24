package ex18;

public class Funcionario {

    private String nome;
    private int idade;
    private char sexo;
    private Double salarioFixo;

    public Funcionario(String nome, int idade, char sexo, Double salarioFixo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.salarioFixo = salarioFixo;
    }

    public Double calcularAbono() {
        Double abono;
        if ((sexo == 'M' && idade >= 30)||(sexo == 'm' && idade >= 30)) {
            abono = 100.0;
        } else if ((sexo == 'M' && idade < 30)||(sexo == 'm' && idade < 30)) {
            abono = 50.0;
        } else if ((sexo == 'F' && idade >= 30)||(sexo == 'f' && idade >= 30)) {
            abono = 200.0;
        } else {
            abono = 80.0;
        }
        return abono;
    }

    public Double calcularSalarioLiquido() {
        Double abono = calcularAbono();
        return salarioFixo + abono;
    }

    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public char getSexo() {
        return sexo;
    }
    public Double getSalarioFixo() {
        return salarioFixo;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public void setSalarioFixo(Double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }
}
