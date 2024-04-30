package aula22;

/*
R009 Escreva um programa e mostre os valores utilizados para calcular o
quadrado de um número positivo através do seguinte método:
“O quadrado de um número positivo N é igual à soma dos N primeiros
números ímpares”. o quadrado de 3 é 9 = 1+3+5, e o de 7 é 49 = 1+3+5+7+9+11+13.
Exemplo: Digite o número a ser elevado ao quadrado: 6
O quadrado de 6 é 36 = 1+3+5+7+9+11
*/

import java.util.Scanner;

/*
    Authors:
        -Fabricio Greiner;
 */

public class R009W {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = leitor.nextInt();

        int somador = 0;
        String strSeqNumeros = "";
        int i = 1, impar = 1;
        while (i <= numero){
            strSeqNumeros = strSeqNumeros + impar +
                    (i == numero ? "" : " + ");
            somador += impar;

            i++;
            impar += 2;
        }

        System.out.println("A soma dos impares é igual a: " + somador +
                           " = "+strSeqNumeros);
    }
}
