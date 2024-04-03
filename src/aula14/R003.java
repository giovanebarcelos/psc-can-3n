package aula14;

import java.util.Scanner;

/*
R003 Você esta fazendo uma pesquisa entre os habitantes de uma pequena vila. Escreva um
algoritmo que colete os dados de idade, sexo (M/F) e salário de todos as pessoas que
desejam participar da pesquisa (para encerrar a entrada de dados entre a idade menor ou
igual a zero). Após coletar todos os dados informe:
a. A média de salário do grupo
b. Maior e menor idade do grupo
c. A percentagem do total de mulheres com salário até R$ 300,00
d. A quantidade de homens

    Author: Alexandre
 */

public class R003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade;
        char sexo;
        double salario;
        int somaIdades = 0;
        int somaSalarios = 0 ;
        int contadorPessoas = 0;
        int maiorIdade = 0;
        int menorIdade = 999;
        int quantidadeMulheres = 0;
        int quantidadeMulheresSalario300 = 0;
        int quantidadeHomens = 0;

        while (true) {
            System.out.print("Digite a idade (ou 0 para encerrar): ");
            idade = scanner.nextInt();
            if (idade <= 0) {
                break;
            }

            somaIdades += idade;
            contadorPessoas++;
            if (idade > maiorIdade) {
                maiorIdade = idade;
            }
            if (idade < menorIdade) {
                menorIdade = idade;
            }

            System.out.print("Digite o sexo (M/F): ");
            sexo = scanner.next().charAt(0);
            if (sexo == 'F') {
                quantidadeMulheres++;
            } else if (sexo == 'M') {
                quantidadeHomens++;
            }

            System.out.print("Digite o salário: ");
            salario = scanner.nextDouble();
            if (sexo == 'F' && salario <= 300.0) {
                quantidadeMulheresSalario300++;
            }
        }

        scanner.close();

        double mediaSalario = 0;
        if (contadorPessoas > 0) {
            mediaSalario = somaSalarios / contadorPessoas;
        }

        double percentualMulheresSalario300 = 0;
        if (quantidadeMulheres > 0) {
            percentualMulheresSalario300 = (double) quantidadeMulheresSalario300 / quantidadeMulheres * 100;
        }

        System.out.println("Média de salário do grupo: " + mediaSalario);
        System.out.println("Maior idade do grupo: " + maiorIdade);
        System.out.println("Menor idade do grupo: " + menorIdade);
        System.out.println("Percentagem do total de mulheres com salário até R$ 300,00: " + percentualMulheresSalario300 + "%");
        System.out.println("Quantidade de homens: " + quantidadeHomens);
    }
}