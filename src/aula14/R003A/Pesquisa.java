package aula14.R003A;

import java.util.ArrayList;

public class Pesquisa {
    private int idade;
    private char sexo;
    private double salario;

    public Pesquisa() {
    }

    public Pesquisa(int idade, char sexo, double salario) {
        this.idade = idade;
        this.sexo = sexo;
        this.salario = salario;
    }

    public char getSexo() {
        return this.sexo;
    }

    public double getSalario() {
        return this.salario;
    }

    public int getIdade() {
        return this.idade;
    }
}
