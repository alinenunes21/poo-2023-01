package com.github.alinenunes21.poo_2023_01.t08;
import java.util.ArrayList;
import java.util.List;
class Arquivo {
    private List<Permissao> permissoes;

    public Arquivo() {
        permissoes = new ArrayList<>();
    }

    public void adicionarPermissao(Permissao permissao) {
        permissoes.add(permissao);
    }
}

