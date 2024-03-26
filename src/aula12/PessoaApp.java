package aula12;

import java.util.Scanner;

public class PessoaApp {
    public static void main(String[] args){
        PessoaApp pessoa = new PessoaApp();
        int opcao = 0;
        while (opcao != 9) {
            opcao = pessoa.menu();
            switch (opcao) {
                case 1:
                    //pessoa.incluir();
                    System.out.println("Incluir");
                    break;
                case 2:
                    //pessoa.listar();
                    System.out.println("Listar");
                    break;
                case 9:
                    break;
                default:
                    System.out.println("Opcao Invalida!");
            }
        }
    }

    private int menu() {
        System.out.println("--- Menu ---");
        System.out.println("1. Incluir");
        System.out.println("2. Listar");
        System.out.println("9. Sair");
        System.out.println("Opcao: ");
        Scanner ler = new Scanner(System.in);
        return ler.nextInt();
    }
}
