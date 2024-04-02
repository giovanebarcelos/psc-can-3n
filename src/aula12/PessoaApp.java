package aula12;

import java.util.ArrayList;
import java.util.Scanner;

public class PessoaApp {
    private ArrayList<Pessoa> pessoas =
            new ArrayList<Pessoa>();
    public static void main(String[] args){
        PessoaApp pessoa = new PessoaApp();
        int opcao = 0;
        while (opcao != 9) {
            opcao = pessoa.menu();
            switch (opcao) {
                case 1:
                    pessoa.incluir();
                    break;
                case 2:
                    pessoa.listar();
                    System.out.println("Listar");
                    break;
                case 9:
                    break;
                default:
                    System.out.println("Opcao Invalida!");
            }
        }
    }

    private void listar() {
        for (Pessoa pessoa: pessoas){
            System.out.println("------");
            System.out.println("Codigo: " + pessoa.codigo);
            System.out.println("Nome: " + pessoa.nome);
            if (pessoa instanceof PessoaFisica){
                System.out.printf("CPF: " +
                        ((PessoaFisica) pessoa).CPF);
            } else {
                System.out.printf("CNPJ: " +
                        ((PessoaJuridica) pessoa).CNPJ);
            }
        }
    }

    private void incluir() {
        System.out.println("--- Incluir Pessoa ---");
        int codigo = Utl.getInt("Codigo: ");
        String nome = Utl.getString("Nome: ");
        String pfOUpj = Utl.getString( "PF ou PJ? ",
                new String[]{"PF", "PJ"},
                "Digite PF ou PJ");
        boolean isPF = "PF".equals(pfOUpj);
        String idPfOuPj = Utl.getString(
                isPF ? "CPF: ": "CNPJ: ");
        Pessoa pessoa;
        if (isPF){
            pessoa = new PessoaFisica(
                    codigo, nome, idPfOuPj);
        } else {
            pessoa = new PessoaJuridica(
                    codigo, nome, idPfOuPj);
        }
        String sn = Utl.getString("Salvar <S/N>? ",
                new String[]{"S", "N"}, "Digite S ou N");
        if ("S".equals(sn)){
            pessoas.add(pessoa);
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
