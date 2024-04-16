package aula18;

import java.util.Scanner;

/*
C005 Escreva um algoritmo que leia dois valores
inteiros e informe se o primeiro é divisível
pelo segundo valor lido ou se o segundo
é divisível pelo primeiro.
 */
public class C005 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Numero 1: ");
        int num1 = ler.nextInt();
        System.out.print("Numero 2: ");
        int num2 = ler.nextInt();

        if (num1 % num2 == 0 &&
            num2 % num1 == 0 ){
            System.out.printf("%d e %d sao divisiveis entre si\n",
                    num2, num1);
        } else if (num1 % num2 == 0){
            System.out.printf("%d é divisivel por %d\n",
                    num1, num2);
        } else if (num2 % num1 == 0){
            System.out.printf("%d é divisivel por %d\n",
                    num2, num1);
        } else {
            System.out.printf(
                    "%d e %d nao sao divisiveis entre si\n",
                    num2, num1);
        }
    }
}
