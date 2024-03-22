package ex3;

public class Vendedor {

    public String nome;
    public Double salariofixo;
    public Double totalvendas;

    public Vendedor(String nome, Double salariofixo, Double totalvendas){
        this.nome = nome;
        this.salariofixo = salariofixo;
        this.totalvendas = totalvendas;
    }

    public Double calcularSalarioTotal(){
        return salariofixo + (totalvendas * 0.15);
    }
}
