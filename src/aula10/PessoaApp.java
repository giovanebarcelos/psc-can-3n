package aula10;

public class PessoaApp {
    public static void main(String[] args){
        Pessoa pessoa = new Pessoa();
        PessoaFisica pf = new PessoaFisica();
        PessoaJuridica pj = new PessoaJuridica();
        pessoa.id = 1;
        pf.id = 2;
        pj.id = 3;
        if (pf instanceof Pessoa){
            System.out.println("pf herda Pessoa");
        }
    }
}
