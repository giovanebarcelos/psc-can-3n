package aula26;

import java.util.Scanner;

public class M015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mês: ");
        int mes = scanner.nextInt();

        System.out.print("Ano: ");
        int ano = scanner.nextInt();

        TemperaturaMensal temperaturaMensal = new TemperaturaMensal(mes, ano);
        System.out.println("\nTemperaturas randomicas:");
        temperaturaMensal.imprimirTemperaturas();

        System.out.println("\nEstatisticas Temperatura Mensal:");
        System.out.printf("Menor: %d", temperaturaMensal.menorTemperatura());
        System.out.printf("\nMaior: %d", temperaturaMensal.maiorTemperatura());
        System.out.printf("\nMedia: %d", temperaturaMensal.temperaturaMedia());
        System.out.printf("\nQtde de dias com temperatura menor que a \n" +
                            " media mensal: %d", temperaturaMensal.qtdeDiasComTempMenorQueMedia());
    }
}
