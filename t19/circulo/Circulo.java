package com.github.alinenunes21.poo_2023_01.t19.circulo;

public class Circulo {
    private int raio;
    private Ponto centro;

    // Construtor
    public Circulo(int raio, Ponto centro) {
        this.raio = raio;
        this.centro = centro;
    }
    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    public Ponto getCentro() {
        return centro;
    }
    public void setCentro(Ponto centro) {
        this.centro = centro;
    }

    // Método para mover o círculo
    public void move(int deltaX, int deltaY) {
        this.centro.move(deltaX, deltaY);
    }
}