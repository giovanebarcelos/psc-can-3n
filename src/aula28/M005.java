package aula28;

/*
M005 Dado uma matriz de ordem 4x4 faça um algoritmo que:
a) Calcule a soma dos elementos da primeira coluna ;
b) Calcule o produto dos elementos da primeira linha;
c) Calcule a soma de todos os elementos da matriz;
d) Calcule a soma do diagonal principal;
e) Calcule a soma da diagonal secundária.
 */

import java.util.Random;

public class M005 {
    private int[][] matriz;

    public static void main(String[] args) {
        //int[][] m = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        M005 matriz = new M005(new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}});

        // matriz.imprimirEstatistica();
        matriz.testeAutomatizado(6, 1, 300);
    }

    public M005(int[][] matriz){
        this.matriz = matriz;
    }

    public void imprimirMatriz(){
        System.out.printf("%6s %6d %6d %6d %6d\n", "M", 0, 1, 2, 3);
        for (int linha = 0; linha < this.matriz.length; linha++){
            System.out.printf("%6d ", linha);
            for (int coluna = 0; coluna < this.matriz.length; coluna++){
                System.out.printf("%6d ", this.matriz[linha][coluna]);
            }
            System.out.println();
        }
    }

    public void imprimirEstatistica(){
        System.out.println("Dados da Matriz:");
        this.imprimirMatriz();

        System.out.printf("\na) Soma dos elementos da primeira coluna: %d",
                this.somaPrimeiraColuna());
        System.out.printf("\nb) Produto dos elementos da primeira linha: %d",
                this.produtoPrimeiraLinha());
        System.out.printf("\nc) Soma de todos os elementos da matriz: %d",
                this.somaMatriz());
        System.out.printf("\nd) Soma da diagonal principal: %d",
                this.somaDiagonalPrincipal());
        System.out.printf("\ne) Soma da diagonal secundária: %d",
                this.somaDiagonalSecundaria());

    }

    public int somaPrimeiraColuna(){
        int soma = 0;

        for (int linha = 0; linha < this.matriz.length; linha++){
            soma += this.matriz[linha][0];
        }

        return soma;
    }
    public int produtoPrimeiraLinha(){
        int produto = 1;

        int coluna = 0;
        while (coluna < this.matriz.length){
            produto *= this.matriz[0][coluna];
            coluna++;
        }

        return produto;
    }

    public int somaMatriz(){
        int soma = 0;

        for (int linha = 0; linha < this.matriz.length; linha++){
            for (int coluna = 0; coluna < this.matriz.length; coluna++){
                soma += this.matriz[linha][coluna];
            }
        }

        return soma;
    }

    public int somaDiagonalPrincipal(){
        int soma = 0;

        for (int linha = 0; linha < this.matriz.length; linha++){
            for (int coluna = 0; coluna < this.matriz.length; coluna++){
                if (linha == coluna) {
                    soma += this.matriz[linha][coluna];
                }
            }
        }

        return soma;
    }

    public int somaDiagonalSecundaria(){
        int soma = 0;
        int qtdElementos = this.matriz.length - 1;

        for (int linha = 0; linha < this.matriz.length; linha++){
            soma += this.matriz[linha][qtdElementos - linha];
        }

        return soma;
    }

    public void testeAutomatizado(int qtdeTestes, int numIni, int numFim){

        for (int teste = 1; teste <= qtdeTestes; teste++){
            System.out.printf("\n---------------- TESTE %d ----------------\n", teste);
            this.gerarDadosAleatorios(numIni, numFim);
            this.imprimirEstatistica();
        }
    }

    private void gerarDadosAleatorios(int numIni, int numFim){
        Random random = new Random();

        for (int linha = 0; linha < this.matriz.length; linha++){
            for (int coluna = 0; coluna < this.matriz.length; coluna++){
                this.matriz[linha][coluna] = random.nextInt((numFim - numIni) + 1) + numIni;
            }
        }
    }
}
