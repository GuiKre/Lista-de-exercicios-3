package ex13;

public class Pessoa {

    private String nome;
    private char sexo;
    private int idade;
    private char saude;

    public Pessoa(String nome, char sexo, int idade, char saude) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.saude = saude;
    }

    public String getNome() {
        return nome;
    }
    public char getSexo() {
        return sexo;
    }
    public int getIdade() {
        return idade;
    }
    public char getSaude() {
        return saude;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setSaude(char saude) {
        this.saude = saude;
    }
}
