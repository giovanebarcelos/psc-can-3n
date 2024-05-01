package aula22;

/*
M016 Faça um algoritmo para ler 10 números e armazenar em um vetor. Após isto, o algoritmo
deve ordenar os números no vetor em ordem crescente. Escrever o vetor ordenado.
M017 O mesmo exercício anterior (M016), mas depois de ordenar os elementos do vetor em
ordem crescente, deve ser lido mais um número qualquer e inserir esse novo número na
posição correta, ou seja, mantendo a ordem crescente do vetor.
 */

import java.util.Arrays;
import java.util.Scanner;

public class M017 {
    public static void main(String[] args) {
        //int[] numeros = lerNumeros();
        int[] numeros = {8,13,73,1,5,63,100,99,2,10};

        System.out.println("Números sem ordenacao");
        imprimir(numeros);

        Arrays.sort(numeros);

        System.out.println("\n\nNúmeros ordenados");
        imprimir(numeros);
    }

    private static void imprimir(int[] numeros) {
        for (int numero: numeros){
            System.out.print(numero+" ");
        }
    }

    private static int[] lerNumeros() {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];
        for (int pos = 0; pos <= numeros.length; pos++){
            System.out.print(pos+1 + ") Número: ");
            numeros[pos] = scanner.nextInt();
        }

        return numeros;
    }
}
