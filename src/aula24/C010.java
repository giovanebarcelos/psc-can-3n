package aula24;

/*
C010 Faça um algoritmo que entre com a Nota do Grau 1 e do Grau 2 e,
     faça a média aritmética dos valores digitados e informe:
     Aprovado se média for maior ou igual a 7 e
     Reprovado se for menor que 7

Authors: Giovane Barcelos
         Fabricio Greiner
*/

import java.util.Scanner;

public class C010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nota do Grau 1: ");
        float notaGrau1 = scanner.nextFloat();
        System.out.print("Nota do Grau 2: ");
        float notaGrau2 = scanner.nextFloat();

        System.out.println(aprovacao(notaGrau1, notaGrau2));
    }

    public static String aprovacao(float notaGrau1, float notaGrau2){
        float media = (notaGrau1 + notaGrau2) / 2;

        if (media >= 7) {
             return "APROVADO!";
        } else {
             return "REPROVADO!";
        }
    }
}
