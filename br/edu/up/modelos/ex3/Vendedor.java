package ex3;

public class Vendedor {

    private String nome;
    private Double salariofixo;
    private Double totalvendas;

    public Vendedor(String nome, Double salariofixo, Double totalvendas){
        this.nome = nome;
        this.salariofixo = salariofixo;
        this.totalvendas = totalvendas;
    }

    public Double calcularSalarioTotal(){
        return salariofixo + (totalvendas * 0.15);
    }

    public String getNome() {
        return nome;
    }
    public Double getSalariofixo() {
        return salariofixo;
    }
    public Double getTotalvendas() {
        return totalvendas;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSalariofixo(Double salariofixo) {
        this.salariofixo = salariofixo;
    }
    public void setTotalvendas(Double totalvendas) {
        this.totalvendas = totalvendas;
    }
}
