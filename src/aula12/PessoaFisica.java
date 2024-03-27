package aula12;
public class PessoaFisica extends Pessoa {
    public String CPF;

    public PessoaFisica(int codigo,
                        String nome,
                        String CPF) {
        super();
        this.codigo = codigo;
        this.nome = nome;
        this.CPF = CPF;
    }
}
