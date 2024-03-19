package aula08;

import java.util.Scanner;

   /*
   Faça um programa que armazene 5
   Alunos com seu nome e idade em um array e
   posteriormente calcule e apresente
   a média de idade dos alunos deste
   array .
 */
public class ArrayAlunos {
    public static void main(String args[]){
        Aluno[] alunos = new Aluno[3];
        Scanner ler = new Scanner(System.in);

        for (int pos = 0; pos < alunos.length; pos++){
            Aluno aluno = new Aluno();
            System.out.print("Nome: ");
            aluno.setNome( ler.next());
            System.out.print("Idade: ");
            aluno.setIdade( ler.nextInt() );
            alunos[pos] = aluno;
        }

        int media = getMedia(alunos);
        System.out.println("Média idades = " + media);
    }

    private static int getMedia(Aluno[] alunos) {
        int somaIdades = 0;
        for (Aluno aluno: alunos){
            somaIdades += aluno.getIdade();
        }
        return somaIdades / alunos.length;
    }
}
