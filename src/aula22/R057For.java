package aula22;

/*
R057 Fazer um algoritmo que calcule e escreva o valor de S:
S = 1/1 + 3/2 + 5/3 + 7/4 + … + 99/50

Authors:
-   Ana Luiza Chiamenti
 */

public class R057For {
    public static void main(String[] args) {
        double soma = 0;

        for (double dividendo = 1, divisor = 1;
             divisor <= 50; divisor += 1, dividendo +=2){
            soma += dividendo / divisor;
        }

        System.out.println(soma);
    }
}
