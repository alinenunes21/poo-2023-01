package com.github.alinenunes21.t21;

import java.util.HashSet;
import java.util.Set;

public class Cardapio {

    private Set<Prato> pratos;

    public Set<Prato> pratosPorDiaDaSemana(DiaDaSemana dia) {
         Set<Prato> fornecidosNoDia = new HashSet<>();
        for (Prato prato : pratos) {
            if (prato.servidoEm(dia)) {
                fornecidosNoDia.add(prato);
            }
        }

        return fornecidosNoDia;

        //return pratos.stream().filter(p -> p.servidoEm(dia))
        //        .collect(Collectors.toSet());

    }
}
