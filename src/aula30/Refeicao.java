package aula30;

public class Refeicao {
    private int codigo;
    private String nome;
    private int qtdeCalorias;
    private TipoRefeicao tipo;

    public Refeicao(int codigo, String nome,
                    int qtdeCalorias, TipoRefeicao tipo) {
        this.codigo = codigo;
        this.nome = nome;
        this.qtdeCalorias = qtdeCalorias;
        this.tipo = tipo;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public int getQtdeCalorias() {
        return this.qtdeCalorias;
    }

    public TipoRefeicao getTipo() {
        return this.tipo;
    }
}
