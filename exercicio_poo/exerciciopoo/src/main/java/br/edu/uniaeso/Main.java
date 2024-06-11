package br.edu.uniaeso;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
    
        Empresa empresa = new Empresa("Uniaeso", "12.345.678/0001-99");

        Departamento deptoTI = new Departamento("TI");
        Departamento deptoRH = new Departamento("RH");
        empresa.adicionarDepartamento(deptoTI);
        empresa.adicionarDepartamento(deptoRH);

        Funcionario f1 = new Funcionario("Alice Emily", 5200.0, LocalDate.of(2020, 1, 15));
        Funcionario f2 = new Funcionario("Gabriela Nascimento", 6500.0, LocalDate.of(2019, 3, 10));
        Funcionario f3 = new Funcionario("Matheus Souza", 7000.0, LocalDate.of(2018, 5, 20));
        Funcionario f4 = new Funcionario("Vagner Silva", 1500.0, LocalDate.of(2021, 2, 23));

        deptoTI.adicionar(f1);  //adicionando os funcionarios
        deptoTI.adicionar(f2);
        deptoRH.adicionar(f3);
        deptoRH.adicionar(f4);

        deptoTI.Aumento(10.0); //aumento de 10%

        empresa.transferir("Alice", "TI", "RH");

        System.out.println("Informações da Empresa:"); //info da empresa
        System.out.println("Nome: " + empresa.getNome());
        System.out.println("CNPJ: " + empresa.getCnpj());

        for (Departamento depto : empresa.getDepartamentos()) {
            if (depto != null) {
                System.out.println("\nDepartamento: " + depto.getNome());
                for (Funcionario func : depto.getFuncionarios()) {
                    if (func != null) {
                        System.out.println(func);
                    }
                }
            }
        }
    }
}
