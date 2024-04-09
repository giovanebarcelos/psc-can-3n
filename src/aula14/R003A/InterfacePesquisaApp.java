package aula14.R003A;

public class InterfacePesquisaApp {
    public static void main(String[] args){
        InterfacePesquisa iPesquisa =
                new InterfacePesquisa();

        iPesquisa.pesquisar();
        iPesquisa.imprimirPesquisa();
    }
}
