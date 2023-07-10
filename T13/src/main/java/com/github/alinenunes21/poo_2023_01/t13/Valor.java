package com.github.alinenunes21.poo_2023_01.t13;

import java.util.Scanner;

public class Valor {
    private int num;

    public void lerNumero() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva um valor:");
        num = sc.nextInt();
    }

    public int getNum() {
        return num;
    }
}
