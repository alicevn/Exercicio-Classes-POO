package br.edu.uniaeso;

import java.time.LocalDate;

public class Funcionario {
    private String nome;
    private double salario;
    private LocalDate dataAdmissao;

    public Funcionario(String nome, double salario, LocalDate dataAdmissao) {
        this.nome = nome;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void Aumento(double percentual) {
        this.salario += this.salario * percentual / 100;
    }

    public String toString() {
        return "Funcionario{" +
                "nome = '" + nome + '\'' +
                ", salario = " + salario +
                ", dataAdmissao = " + dataAdmissao +
                '}';
    }
}