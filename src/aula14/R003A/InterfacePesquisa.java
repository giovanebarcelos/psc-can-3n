package aula14.R003A;

//Author: Fabricio Greiner;

import java.util.ArrayList;
import java.util.Scanner;

public class InterfacePesquisa {
    private ArrayList<Pesquisa> dadosColetados =
            new ArrayList<Pesquisa>();

    public void pesquisar() {
        Scanner read = new Scanner(System.in);

        int idade = 0;
        char sexo;
        double salario;

        while (true) {
            System.out.println("Digite uma idade: (ou 0 para encerrar) ");
            idade = read.nextInt();
            if (idade <= 0) {
                System.out.println("Operação finalizda!");
                System.out.println();
                break;
            } else {
                System.out.println("Digite um sexo: (M/F) ");
                sexo = read.next().charAt(0);
                System.out.println("Digite um salário: ");
                salario = read.nextDouble();

                Pesquisa pesquisa = new Pesquisa(idade, sexo, salario);
                this.dadosColetados.add(pesquisa);
            }
        }
    }

    public void imprimirPesquisa() {
        int quantHomens = this.qtdeHomens();
        double mediaSalario = this.mediaSalario();
        int menorTrezentos = this.menorTrezentos();
        int maiorIdade = this.menorIdade();
        int menorIdade = this.maiorIdade();

        System.out.printf("A média salarial do grupo é: R$ %.2f\n", mediaSalario);
        System.out.printf("Maior idade: %d | Menor idade: %d\n", maiorIdade,menorIdade);
        System.out.printf("Quantidade de mulheres com salários abaixo de R$ 300: %d\n",menorTrezentos);
        System.out.printf("Quantidade de homens: %d\n",quantHomens);
    }

    private int qtdeHomens() {
        int qtdeHomens = 0;
        for (Pesquisa pesquisa: dadosColetados){
            if (pesquisa.getSexo() == 'M'){
                qtdeHomens++;
            }
        }
        return qtdeHomens;
    }

    private int maiorIdade() {
        int maior = 0;
        for (int i = 0; i < this.dadosColetados.size(); i++) {
            if (this.dadosColetados.get(i).getIdade() > maior) {
                maior = this.dadosColetados.get(i).getIdade();
            }
        }
        return maior;
    }

    private int menorIdade() {
        int min = this.dadosColetados.get(0).getIdade();
        for (int i = 0; i < this.dadosColetados.size(); i++) {
            if (this.dadosColetados.get(i).getIdade() < min) {
                min = this.dadosColetados.get(i).getIdade();
            }
        }
        return min;
    }

    private int menorTrezentos() {
        int quantidadeMenorTrezentos = 0;
        for (int i = 0; i < this.dadosColetados.size(); i++) {
            if (this.dadosColetados.get(i).getSalario() < 300 && this.dadosColetados.get(i).getSexo() == 'F') {
                quantidadeMenorTrezentos++;
            }
        }
        return quantidadeMenorTrezentos;
    }

    private double mediaSalario() {
        double salarios = 0;
        for (int i = 0; i < this.dadosColetados.size(); i++) {
            salarios += this.dadosColetados.get(i).getSalario();
        }
        return salarios / this.dadosColetados.size();
    }
}