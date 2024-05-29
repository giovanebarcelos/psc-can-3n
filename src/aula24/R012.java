package aula24;

/*
R012 Elabore um algoritmo para calcular e imprimir a média aritmética dos números inteiros
positivos ímpares inferiores ou iguais a um número N lido inicialmente.
*/

import java.util.Scanner;

public class R012 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = read.nextInt();

        int somaImpares = 0, contador = 0, qtdeImpares = 0;

        while (contador < numero) {
            if (contador % 2 != 0) {
                somaImpares += contador;
                qtdeImpares++;
            }
            contador++;
        }
        System.out.println("Media dos impares: " + (somaImpares / qtdeImpares));
    }
}