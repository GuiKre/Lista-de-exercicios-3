package ex12;

public class Veiculo {

    private int ano;

    public Veiculo(int ano) {
        this.ano = ano;
    }

    public double calcularDesconto() {
        if (ano <= 2000) {
            return 0.12; 
        } else {
            return 0.07; 
        }
    }

    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
}
