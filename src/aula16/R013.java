package aula16;

/*
R013 Faça um algoritmo para ler o saldo de 10 (dez)
clientes de um banco.
Calcular e mostrar:
- o saldo médio dos clientes
- a porcentagem de clientes com saldo devedor.
- o número de clientes com saldo credor.
 */

import javax.swing.*;

public class R013 {
    public static void main(String[] args) {
        double[] saldos = lerSaldos(10);

        double somaSaldos = 0.0;
        int qtdeClientesDevedor = 0;
        for( double saldo: saldos){
            somaSaldos += saldo;
            if (saldo < 0.0){
                qtdeClientesDevedor++;
            }
        }

        if (saldos.length == 0){
            System.out.println("Não forma lido dados!");
            return;
        }

        System.out.printf("Saldo Médio: %12.2f\n",
                somaSaldos / saldos.length);
        System.out.printf("Percentual Clientes Saldo Devedor: %12.2f %%\n",
                (float) qtdeClientesDevedor /
                        (float) saldos.length * 100.0);
        System.out.printf("Qtde Clientes Saldo Devedor: %d",
                qtdeClientesDevedor);
    }

    private static double[] lerSaldos(int qtdeSaldos) {
        double[] saldos = new double[qtdeSaldos];

        while (--qtdeSaldos > -1){
            saldos[qtdeSaldos] =
              Double.parseDouble(
                JOptionPane.showInputDialog(
                      "Saldo "+(qtdeSaldos+1)));
        }
        return saldos;
    }
}
