package br.edu.uniaeso;

public class Empresa {
    private String nome;
    private String cnpj;
    private Departamento[] departamentos;
    private int numeroDepartamentos;

    public Empresa(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.departamentos = new Departamento[10];
        this.numeroDepartamentos = 0;
    }

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public Departamento[] getDepartamentos() {
        return departamentos;
    }

    public int getNumeroDepartamentos() {
        return numeroDepartamentos;
    }

    public void adicionarDepartamento(Departamento departamento) {
        if (numeroDepartamentos < 10) {
            departamentos[numeroDepartamentos] = departamento;
            numeroDepartamentos++;
        } else {
            System.out.println("Número máximo atingido");
        }
    }

    public Departamento buscarDepartamento(String nome) {
        for (int i = 0; i < numeroDepartamentos; i++) {
            if (departamentos[i].getNome().equals(nome)) {
                return departamentos[i];
            }
        }
        return null;
    }

    public void transferir(String nomeFuncionario, String DepartamentoOrigem, String DepartamentoDestino) {
        Departamento departamentoOrigem = buscarDepartamento(DepartamentoOrigem);
        Departamento departamentoDestino = buscarDepartamento(DepartamentoDestino);

        if (departamentoOrigem != null && departamentoDestino != null) {
            Funcionario funcionario = departamentoOrigem.buscar(nomeFuncionario);
            if (funcionario != null) {
                departamentoOrigem.remover(nomeFuncionario);
                departamentoDestino.adicionar(funcionario);
            } else {
                System.out.println("Funcionário não encontrado.");
            }
        } else {
            System.out.println("Departamento(s) não encontrado(s).");
        }
    }
}