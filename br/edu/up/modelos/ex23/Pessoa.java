package ex23;

public class Pessoa {

    private String nome;
    private char sexo;
    private Double altura;
    private int idade;

    public Pessoa(String nome, char sexo, Double altura, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.altura = altura;
        this.idade = idade;
    }

    public Double calcularPesoIdeal() {
        if ((sexo == 'M')||(sexo == 'm')) {
            if (altura > 1.70) {
                if (idade <= 20)
                    return (72.7 * altura) - 58;
                else if (idade >= 21 && idade <= 39)
                    return (72.7 * altura) - 53;
                else
                    return (72.7 * altura) - 45;
            } else {
                if (idade <= 40)
                    return (72.7 * altura) - 50;
                else
                    return (72.7 * altura) - 58;
            }
        } else {
            if (altura > 1.50) {
                if (idade >= 35)
                    return (62.1 * altura) - 45;
                else 
                    return (62.1 * altura) - 49;
            } else { 
                return (62.1 * altura) - 44.7;
            }
        }
    }

    public String getNome() {
        return nome;
    }
    public char getSexo() {
        return sexo;
    }
    public Double getAltura() {
        return altura;
    }
    public int getIdade() {
        return idade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public void setAltura(Double altura) {
        this.altura = altura;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
}
