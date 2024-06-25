package aula30;
/*
R037 Fazer um algoritmo que:
- Leia um número indeterminado de linhas contendo
cada uma a idade de um indivíduo. A última linha que
 não entrará nos cálculos, contém o valor da idade
 igual a zero.
- Calcule e escreva a idade média deste grupo de
indivíduos.
 */

import java.util.Scanner;

public class R037 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade = 0, somaIdades = 0, qtdeIdades = 0;
        do {
            System.out.print("Idade: ");
            idade = scanner.nextInt();

            if (idade > 0){
                somaIdades += idade;
                qtdeIdades++;
            }

        } while (idade > 0);

        System.out.printf("A idade média é %d",
                somaIdades / qtdeIdades);
    }
}
