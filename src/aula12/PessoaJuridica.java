package aula12;
public class PessoaJuridica extends Pessoa {
    public String CNPJ;

    public PessoaJuridica(int codigo,
                          String nome,
                          String CNPJ) {
        super();
        this.codigo = codigo;
        this.nome = nome;
        this.CNPJ = CNPJ;
    }
}
