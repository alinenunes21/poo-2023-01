package com.github.alinenunes21.poo_2023_01.t11;
import java.time.LocalDate;

public class Periodo {
    private LocalDate dataInicial;
    private LocalDate dataFinal;

    public Periodo(LocalDate dataInicial, LocalDate dataFinal) {
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    @Override
    public String toString() {
        return "De " + dataInicial.toString() + " até " + dataFinal.toString();
    }
}
