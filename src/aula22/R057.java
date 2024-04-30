package aula22;

/*
R057 Fazer um algoritmo que calcule e escreva o valor de S:
S = 1/1 + 3/2 + 5/3 + 7/4 + … + 99/50

Authors:
-   Ana Luiza Chiamenti
 */

public class R057 {
    public static void main(String[] args) {
        double soma = 0;
        double dividendo = 1;
        double divisor = 1;

        while(divisor <= 50){
            soma += dividendo / divisor;

            divisor += 1;
            dividendo +=2;
        }
        System.out.println(soma);
    }
}
