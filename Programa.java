public class Programa {

    public static void main(String[] args){

        int num = Prompt.lerInteiro("Digite o número da questão que deseja executar(1 a 26): ");
        
        switch (num) {
            case 1:  Exercicio01.executar(); break;
            case 2:  Exercicio02.executar(); break;
            case 3:  Exercicio03.executar(); break;
            case 4:  Exercicio04.executar(); break;
            case 5:  Exercicio05.executar(); break;
            case 6:  Exercicio06.executar(); break;
            case 7:  Exercicio07.executar(); break;
            case 8:  Exercicio08.executar(); break;
            case 9:  Exercicio09.executar(); break;
            case 10: Exercicio10.executar(); break;
            case 11: Exercicio11.executar(); break;
            case 12: Exercicio12.executar(); break;
            case 13: Exercicio13.executar(); break;
            case 14: Exercicio14.executar(); break;
            case 15: Exercicio15.executar(); break;
            case 16: Exercicio16.executar(); break;
            case 17: Exercicio17.executar(); break;
            case 18: Exercicio18.executar(); break;
            case 19: Exercicio19.executar(); break;
            case 20: Exercicio20.executar(); break;
            case 21: Exercicio21.executar(); break;
            case 22: Exercicio22.executar(); break;
            case 23: Exercicio23.executar(); break;
            case 24: Exercicio24.executar(); break;
            case 25: Exercicio25.executar(); break;
            case 26: Exercicio26.executar(); break;
            default: Prompt.imprimir("Número da questão inválido."); break;      
        }
    }
}
