package aula18;

import java.util.Scanner;

public class C028A {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = ler.nextLine();
        System.out.print("Idade: ");
        int idade = ler.nextInt();

        double valor = getValorTabela(idade);
        System.out.printf("Nome: %s\n", nome);
        System.out.printf("Valor: %12.2f", valor);
    }

    private static double getValorTabela(int idade) {
        double[][] tabela = {
                {10, 30.0}, {29, 60.0}, {45, 120},
                {59, 150.0}, {65, 250}};
        double valor = 400;

        for (int faixa = 0; faixa < tabela.length;
             faixa++){
            if (idade <= tabela[faixa][0]){
                valor = tabela[faixa][1];
                break;
            }
        }

        return valor;
    }
}
