package com.github.alinenunes21.poo_2023_01.t11;
import java.util.List;
import java.util.ArrayList;
public class Lanchonete {
    private List <Funcionarios> funcionarios;

    public Lanchonete() {
        funcionarios = new ArrayList <> ( );
    }

    public void adicionarFuncionarios(Funcionarios funcionarios) {
        funcionarios.add (getFuncionarios ());
    }

    public List <Funcionarios> getFuncionarios() {
        return funcionarios;
    }

}