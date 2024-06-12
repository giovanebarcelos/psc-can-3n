package aula28;

/*
R001 Faça um algoritmo que leia um número de referência, um número inicial e outro final.
     Informe se o número de referência encontra-se entre o número inicial e o final digitados.
 */

import java.util.Scanner;

public class R001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Número de Referência: ");
        int numRef = scanner.nextInt();
        System.out.print("Número Inicial: ");
        int numIni = scanner.nextInt();
        System.out.print("Número Final: ");
        int numFim = scanner.nextInt();

        if (numIni > numFim){
            int numIniBackup = numIni;
            numIni = numFim;
            numFim = numIniBackup;
        }

        if (numRef >= numIni && numRef <= numFim){
            System.out.printf("\nMensagem: Número %d esta entre %d e %d", numRef, numIni, numFim);
        } else {
            System.out.printf("\nMensagem: Número %d não esta entre %d e %d", numRef, numIni, numFim);
        }
    }
}
