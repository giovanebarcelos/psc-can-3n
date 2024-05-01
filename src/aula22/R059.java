package aula22;

/*
R059 Faça um algoritmo que imprima os 20 primeiros termos da série de Fibonacci.
Obs.: os dois primeiros termos desta série são 0 e 1.
Os demais são gerados a partir da soma dos anteriores.
Ex.: 0+1 = 1 → terceiro termo; 1+1 = 2 → quarto termo; 1+2=3→ quinto termo; ..
*/
public class R059 {
    public static void main(String[] args) {
        int primeiroTermo = 0;
        int segundoTermo = 1;
        int proximoTermo = 0;

        System.out.print(primeiroTermo + " " + segundoTermo);

        for (int termos = 18; termos > 0; termos--){
            proximoTermo = primeiroTermo + segundoTermo;
            System.out.print(" " + proximoTermo);
            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
        }
    }
}
