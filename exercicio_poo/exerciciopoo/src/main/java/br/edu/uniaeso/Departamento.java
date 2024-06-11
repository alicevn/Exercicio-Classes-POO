package br.edu.uniaeso;

public class Departamento {
    private String nome;
    private Funcionario[] funcionarios;
    private int numeroFuncionarios;

    public Departamento(String nome) {
        this.nome = nome;
        this.funcionarios = new Funcionario[100];
        this.numeroFuncionarios = 0;
    }

    public String getNome() {
        return nome;
    }

    public Funcionario[] getFuncionarios() {
        return funcionarios;
    }

    public int getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void adicionar(Funcionario funcionario) {
        if (numeroFuncionarios < 100) {  //se o numero de funcionarios for menor que 100, adiciona um novo funcionario.
            funcionarios[numeroFuncionarios] = funcionario;
            numeroFuncionarios++;
        } else {
            System.out.println("Número máximo de funcionários atingido.");
        }
    }

    public void remover(String nome) {
        for (int i = 0; i < numeroFuncionarios; i++) {
            if (funcionarios[i].getNome().equals(nome)) {
                funcionarios[i] = funcionarios[numeroFuncionarios - 1];
                funcionarios[numeroFuncionarios - 1] = null;
                numeroFuncionarios--;
                break;
            }
        }
    }

    public Funcionario buscar(String nome) {
        for (int i = 0; i < numeroFuncionarios; i++) {
            if (funcionarios[i].getNome().equals(nome)) {
                return funcionarios[i];
            }
        }
        return null;
    }

    public void Aumento(double percentual) {
        for (int i = 0; i < numeroFuncionarios; i++) {
            funcionarios[i].Aumento(percentual);
        }
    }
}