package com.github.alinenunes21.poo_2023_01.t11;

public class JanelaComVidro extends Janela {
    private double areaVidro;

    public JanelaComVidro(double area, double areaVidro) {
        super(area);
        this.areaVidro = areaVidro;
    }

    public double getAreaVidro() {
        return areaVidro;
    }

    public void setAreaVidro(double areaVidro) {
        this.areaVidro = areaVidro;
    }

    public double getAreaRestante() {
        return area - areaVidro;
    }
}
