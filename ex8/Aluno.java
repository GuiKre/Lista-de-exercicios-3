package ex8;

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
        return (nota1 + nota2 + nota3) / 3;
    }

    public String situaçãoAluno(){
        Double media = calcularMedia();
        if(media >= 7.0){
            return "Aprovado!";
        }else if(media <= 5.0){
            return "Reprovado!";
        }else{
            return "Recuperação!";
        }
    }
}
