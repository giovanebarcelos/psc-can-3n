package aula04;

import java.util.Scanner;

public class C002 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int numero;
        do {
            System.out.print("Número: ");
            numero = ler.nextInt();

            imprimirParOuImpar(numero);
            imprimirNumeroDescrecente(numero);
        } while( numero > 0);
    }

    private static void imprimirNumeroDescrecente(
            int numero) {
        System.out.println();
        while (numero > 0){
            System.out.print(numero + " ");
            numero = numero - 1;
        }
        System.out.println();

    }

    private static void imprimirParOuImpar(int numero) {
        if (numero % 2 == 0){
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }
    }
}
