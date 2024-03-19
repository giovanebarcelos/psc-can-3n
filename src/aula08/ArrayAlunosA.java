package aula08;

import java.util.ArrayList;
import java.util.Scanner;

/*
Faça um programa que armazene 5
Alunos com seu nome e idade em um array e
posteriormente calcule e apresente
a média de idade dos alunos deste
array .
*/
public class ArrayAlunosA {
 public static void main(String args[]){
     ArrayList<Aluno> alunos = new ArrayList<Aluno>();
     Scanner ler = new Scanner(System.in);

     int idade = 0;
     String nome;
     do {
         System.out.print("Nome: ");
         nome = ler.next();
         System.out.print("Idade: ");
         idade = ler.nextInt();
         if (idade > 0){
             Aluno aluno = new Aluno(nome, idade);
             alunos.add(aluno);
         }

     } while (idade > 0);

     int media = getMedia(alunos);
     System.out.println("Média idades = " + media);
 }

 private static int getMedia(ArrayList<Aluno> alunos) {
     int somaIdades = 0;
     for (Aluno aluno: alunos){
         somaIdades += aluno.getIdade();
     }
     return somaIdades / alunos.size();
 }
}
