package com.github.alinenunes21.poo_2023_01.t19.circulo;

public class Ponto {
    private int x;
    private int y;

    // Construtor
    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getters e Setters
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Método para mover o ponto
    public void move(int deltaX, int deltaY) {
        this.x += deltaX;
        this.y += deltaY;
    }
}