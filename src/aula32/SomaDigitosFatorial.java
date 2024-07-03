package aula32;
/*
https://projecteuler.net/problem=20
Soma dos Digitos do Fatorial
Problema 20
n! significa n x (n-1) x ... x 3 x 2 x 1.
Por exemplo, 10! = 10 x 9 x ... x 3 x 2 x 1 = 3628800,
e a soma dos digitos do número 10! é
3 + 6 + 2 + 8 + 8 + 0 + 0 = 27
Encontre a soma dos digitos do número 100!.
*/

import java.math.BigInteger;

public class SomaDigitosFatorial {
    public static void main(String[] args) {
        BigInteger fatorial = fatorial(100);
        long somaDigitos =
                somarDigitos(fatorial);

        System.out.printf("A soma dos digitos do " +
                "fatorial 100! é %d", somaDigitos);
    }

    private static long somarDigitos(BigInteger numero) {
        String digitos[] = numero.toString().split("");
        long somaDigitos = 0;

        for (String digito: digitos){
            somaDigitos += Integer.parseInt(digito);
        }

        return somaDigitos;
    }

    private static BigInteger fatorial(int numero) {
        BigInteger fatorial = BigInteger.valueOf(1);

        while (numero > 1){
            fatorial = fatorial.multiply(BigInteger.valueOf(numero));
            numero--;
        }

        return fatorial;
    }
}
