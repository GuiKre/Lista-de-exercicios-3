package ex11;

public class Pessoa {

    private String nome;
    private char sexo;

    public Pessoa(String nome, char sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public String sexo() {
        if (sexo == 'M' || sexo == 'm') {
            return "Homem";
        } else if (sexo == 'F' || sexo == 'f') {
            return "Mulher";
        } else {
            return "Indefinido";
        } 
    }

    public String getNome() {
        return nome;
    }
    public char getSexo() {
        return sexo;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
}
