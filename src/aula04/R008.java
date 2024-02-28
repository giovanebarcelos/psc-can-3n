package aula04;

import java.util.Scanner;

/*
R008 Escreva um algoritmo que leia um valor
inteiro, calcule e mostre o seu fatorial.
*/
public class R008 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        System.out.print("Número: ");
        int numero = ler.nextInt();

        int fatorial = getFatorial(numero);

        System.out.println("Fatorial: "  + fatorial);
    }

    private static int getFatorial(int numero) {
        int fatorial = 1,
            contador = 1;
        while (contador <= numero){
            fatorial = fatorial * contador;
            contador = contador + 1;
        }
        return fatorial;
    }
}
