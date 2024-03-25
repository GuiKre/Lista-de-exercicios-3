package ex26;

public class Pretendente {

    public String nome;
    public int idade;
    public int grupoRisco;

    public Pretendente(String nome, int idade, int grupoRisco) {
        this.nome = nome;
        this.idade = idade;
        this.grupoRisco = grupoRisco;
    }

    public String determinarCategoriaSeguro() {
        if (idade >= 17 && idade <= 20) {
            return determinarCategoriaPorIdade(1);
        } else if (idade >= 21 && idade <= 24) {
            return determinarCategoriaPorIdade(2);
        } else if (idade >= 25 && idade <= 34) {
            return determinarCategoriaPorIdade(3);
        } else if (idade >= 35 && idade <= 64) {
            return determinarCategoriaPorIdade(4);
        } else if (idade >= 65 && idade <= 70) {
            return determinarCategoriaPorIdade(7);
        } else {
            return "Idade não se enquadra em nenhuma das categorias ofertadas.";
        }
    }

    private String determinarCategoriaPorIdade(int faixaIdade) {
        int categoria = faixaIdade + grupoRisco - 1;
        return "Categoria de seguro para " + nome + ": " + categoria;
    }
}
