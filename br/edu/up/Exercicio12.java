import ex12.Veiculo;

public class Exercicio12 {

    public static void executar(){

        int carros2000 = 0;
        int geral = 0;
        
        char opcao;
        do {
            int ano = Prompt.lerInteiro("Digite o ano do veículo: ");
            
            Double valorOriginal = Prompt.lerDecimal("Digite o preço do veículo sem descontos: ");

            Veiculo veiculo = new Veiculo(ano);
            
            Prompt.imprimir("Desconto: " + (veiculo.calcularDesconto() * 100) + "%");
            
            Double valorComDesconto = valorOriginal - (valorOriginal * veiculo.calcularDesconto());
            System.out.println("Valor a ser pago pelo cliente: R$" + valorComDesconto);
            
            if (ano <= 2000) {
                carros2000++;
            }
            geral++;
            
            opcao = Prompt.lerCaractere("Deseja calcular o desconto de outro carro? (S/N)");
        } while (opcao == 'S' || opcao == 's');
        
        Prompt.imprimir("Carros até 2000: " + carros2000);
        Prompt.imprimir("Geral: " + geral);
    }
}
