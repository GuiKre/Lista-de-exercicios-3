package ex9;

public class Contador {

    public static int numerosIntervalo(Double[] numeros){
        int contador = 0;
        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] >= 10 && numeros[i] <= 150){
                contador++;
            }
        }
        return contador;
    }
}
