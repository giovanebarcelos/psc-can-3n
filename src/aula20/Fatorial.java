package aula20;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.print("Numero: ");
            int numero = scanner.nextInt();
            if (numero < 1){
                break;
            }
            //int numFatorial = fatorial(numero);
            //int numFatorial = fatorialFor(numero);
            int numFatorial = fatorialDoWhile(numero);
            System.out.printf(
                    "Fatorial de %d eh %d\n",
                    numero, numFatorial);
        }

    }

    public static int fatorial(int numero){
        int fator = 1, fatorial = 1;
        while (fator <= numero){
            fatorial = fatorial * fator;
            fator++;
        }
        return fatorial;
    }

    public static int fatorialFor(int numero){
        int fatorial = 1;
        for (int fator = 1;
             fator <= numero;
             fator++){
            fatorial = fatorial * fator;
        }
        return fatorial;
    }

    public static int fatorialDoWhile(int numero){
        int fator = 1, fatorial = 1;
        do {
            fatorial = fatorial * fator;
            fator++;
        } while (fator <= numero);

        return fatorial;
    }

    public static int fatorialRecursivo(int numero){
        if (numero < 2){
            return numero;
        }

        return (numero * fatorialRecursivo(numero - 1));
    }
}
