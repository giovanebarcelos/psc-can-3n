package aula30;

import java.util.ArrayList;
import java.util.Scanner;

public class RefeicaoApp {
    private ArrayList<Refeicao> refeicoes;
    private ArrayList<Refeicao> comanda;

    public static void main(String[] args) {
        RefeicaoApp refeicaoApp = new RefeicaoApp();

        refeicaoApp.carregarRefeicoes();
        refeicaoApp.lerRefeicoes();
    }

    private void carregarRefeicoes() {
        this.refeicoes = new ArrayList<Refeicao>();

        this.refeicoes.add(new Refeicao(
          1, "Vegetariano", 180, TipoRefeicao.Prato));
        this.refeicoes.add(new Refeicao(
                2, "Peixe", 230, TipoRefeicao.Prato));
        this.refeicoes.add(new Refeicao(
                3, "Frango", 250, TipoRefeicao.Prato));
        this.refeicoes.add(new Refeicao(
                4, "Carne", 350, TipoRefeicao.Prato));

        this.refeicoes.add(new Refeicao(
                1, "Abacaxi", 75, TipoRefeicao.Sobremesa));
        this.refeicoes.add(new Refeicao(
                2, "Sorvete Diet", 110, TipoRefeicao.Sobremesa));
        this.refeicoes.add(new Refeicao(
                3, "Mousse Diet", 170, TipoRefeicao.Sobremesa));
        this.refeicoes.add(new Refeicao(
                4, "Mouse Chocolate", 200, TipoRefeicao.Sobremesa));

        this.refeicoes.add(new Refeicao(
                1, "Chá", 20, TipoRefeicao.Bebida));
        this.refeicoes.add(new Refeicao(
                2, "Suco de Laranja", 70, TipoRefeicao.Bebida));
        this.refeicoes.add(new Refeicao(
                3, "Suco de Melão", 100, TipoRefeicao.Bebida));
        this.refeicoes.add(new Refeicao(
                4, "Refrigente Diet", 65, TipoRefeicao.Bebida));
    }

    public void lerRefeicoes() {
        System.out.println("== Refeicao ==\n");
        Refeicao prato = this.lerRefeicao(TipoRefeicao.Prato);
        Refeicao sobremesa = this.lerRefeicao(TipoRefeicao.Sobremesa);
        Refeicao bebida = this.lerRefeicao(TipoRefeicao.Bebida);

        comanda = new ArrayList<Refeicao>();
        comanda.add(prato);
        comanda.add(sobremesa);
        comanda.add(bebida);

        System.out.printf("Total de calorias da refeição: %d",
                this.getTotalCalorias());
    }

    private Refeicao lerRefeicao(TipoRefeicao tipoRefeicao) {
        Refeicao refeicao;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print(tipoRefeicao.name() + ": ");
            this.listarRefeicoes(tipoRefeicao);
            System.out.printf("Digite o código da opção de %s: ",
                    tipoRefeicao.name());
            int codigo = scanner.nextInt();

            refeicao = this.getRefeicao(
                    tipoRefeicao, codigo);

            if (refeicao == null) {
                System.out.println("Código Inválido!");
            }
        } while (refeicao == null);

        return refeicao;
    }

    private void listarRefeicoes(TipoRefeicao tipo) {

    }

    private Refeicao getRefeicao(TipoRefeicao tipo, int codigo) {
        return null;
    }

    private int getTotalCalorias() {
        return 0;
    }
}
