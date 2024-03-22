package ex1;

public class Aluno {

    public String nome;
    public Double nota1;
    public Double nota2;
    public Double nota3;

    public Aluno(String nome, Double nota1, Double nota2, Double nota3){
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public Double calcularMedia(){
        return (nota1 + nota2 + nota3)/3.0;
    }

    public String getNome(){
        return nome;
    }
}
