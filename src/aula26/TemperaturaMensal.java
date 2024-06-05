package aula26;

import java.util.Random;

public class TemperaturaMensal {
    private int[] temperaturas;

    public TemperaturaMensal(int mes, int ano) {
        int qtdeDias = this.qtdeDias( mes, ano );

        this.temperaturas = new int[qtdeDias];

        this.preencherTemperaturas();
    }

    private void preencherTemperaturas() {

        Random random = new Random();
        int tempMinima = 10;
        int tempMaxima = 40;

        // inicializacão de variável controlador; decisão de continuidade; passo da var controlador
        for (int cont = 0; cont < this.temperaturas.length;cont++){
            int tempAleatoria = random.nextInt((tempMaxima-tempMinima) + 1) + tempMinima;
            this.temperaturas[cont] = tempAleatoria;
        }
    }

    private int qtdeDias(int mes, int ano) {
        int qtdeDiasNoMes[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if ((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))){
            qtdeDiasNoMes[1] = 29;
        }
        
        return qtdeDiasNoMes[ mes-1 ];
    }

    public void imprimirTemperaturas() {
        for (int cont = 0; cont < this.temperaturas.length;cont++){
            System.out.print( this.temperaturas[cont] );

            if (cont != this.temperaturas.length-1){
                System.out.print(", ");
            }

            if ((cont+1) % 10 == 0){
                System.out.println();
            }
        }
    }

    public int menorTemperatura() {
        int menorTemp = this.temperaturas[0];

        for (int i = 1; i < this.temperaturas.length; i++){
            if (menorTemp > this.temperaturas[i]){
                menorTemp = this.temperaturas[i];
            }
        }

        return menorTemp;
    }

    public int maiorTemperatura() {
        int maiorTemp = this.temperaturas[0];

        for (int i = 1; i < this.temperaturas.length; i++){
            if (maiorTemp < this.temperaturas[i]){
                maiorTemp = this.temperaturas[i];
            }
        }

        return maiorTemp;

    }

    public int temperaturaMedia() {
        int somaTemp = 0;

        int i = 0;
        while (i < this.temperaturas.length){
            somaTemp += this.temperaturas[i];
            i++;
        }

        return somaTemp / this.temperaturas.length;
    }

    public int qtdeDiasComTempMenorQueMedia() {
        int qtdeDias = 0,
            mediaTemp = this.temperaturaMedia();

        int i = 0;
        while (i < this.temperaturas.length){
            if (this.temperaturas[i] < mediaTemp) {
                qtdeDias++;
            }

            i++;
        }

        return qtdeDias;

    }
}
