package aula32;
/*
https://projecteuler.net/problem=10
Soma dos Primos
Problema 10
A soma dos primos menores que 10 é 2 + 3 + 5 + 7 = 17.
Encontre a soma de todos os primos menores que
dois milhões.
*/

import java.time.temporal.IsoFields;

public class SomaPrimos {
    public static void main(String[] args) {
        SomaPrimos somaPrimos = new SomaPrimos();

        long somaDosPrimos =
                somaPrimos.somarPrimos(2000000);

        System.out.printf("\nSoma dos primos menores " +
                "que dois milhões = %d\n", somaDosPrimos);
    }

    private long somarPrimos(long numero) {
        long somaPrimos = 0;
        while (numero > 0){
            if ( this.ehPrimo(numero) ){
                somaPrimos += numero;
            }

            numero--;
        }
        return somaPrimos;
    }

    private boolean ehPrimo(long numero) {
        for (long divisor = 2;
             divisor <= Math.sqrt(numero);
             divisor++){
            if (numero % divisor == 0){
                return false;
            }
        }
        return true;
    }
}
