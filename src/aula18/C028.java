package aula18;

import java.util.Scanner;

public class C028 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = ler.nextLine();
        System.out.print("Idade: ");
        int idade = ler.nextInt();

        double valor;
        if (idade <= 10){
            valor = 30.0;
        } else if (idade <= 29){
            valor = 60.0;
        } else if (idade <= 45){
            valor = 120.0;
        } else if (idade <= 59){
            valor = 150.0;
        } else if (idade <= 65){
            valor = 250.0;
        } else {
            valor = 400.0;
        }
        System.out.printf("Nome: %s\n", nome);
        System.out.printf("Valor: %12.2f", valor);
    }
}
