package aula08;
public class Aluno {
    public Aluno(String nome, int idade) {
        this.setNome(nome);
        this.setIdade(idade);
    }

    private String nome;
    private int idade;

    public Aluno() {
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
