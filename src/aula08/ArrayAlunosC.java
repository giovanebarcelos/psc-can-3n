package aula08;

import java.util.Scanner;

/*
   Faça um programa que armazene 5
   idades de alunos em um array e
   posteriormente calcule e apresente
   a média de idade dos alunos deste
   array .
 */
public class ArrayAlunosC {
    public static void main(String args[]){
        int[] idades = new int[5];
        Scanner ler = new Scanner(System.in);

        for (int pos = 0; pos < 5; pos++){
            System.out.print("Idades[" + pos +"] = ");
            idades[pos] = ler.nextInt();
        }

        int media = getMedia(idades);
        System.out.println("Média idades = " + media);
    }

    private static int getMedia(int[] idades) {
        int somaIdades = 0;
        for (int idade: idades){
            somaIdades += idade;
        }
        return somaIdades / idades.length;
    }
}
