package aula24;

/*
R011 Escreva um programa que leia um valor inteiro n, calcule e mostre a soma dos n primeiros
números pares. Exemplo: n = 3, apresentará 2 + 4 + 6 = 12.

Authors:
 */

import java.util.Scanner;

public class R011 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = read.nextInt();

        int somaPares = 0;
        
        for (int i = 1, par = 2; i <= numero; i++, par += 2) {
            System.out.print( par + (numero == i ? "" : " + "));
            somaPares += par;
        }
        System.out.println(" = " + somaPares);
    }
}