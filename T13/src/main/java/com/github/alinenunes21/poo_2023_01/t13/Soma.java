package com.github.alinenunes21.poo_2023_01.t13;
import java.util.Scanner;

import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Valor valor = new Valor();
        valor.lerNumero();
        int num = valor.getNum();

        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva outro valor:");
        int num2 = sc.nextInt();

        int soma = num + num2;
        System.out.println("A soma é: " + soma);
    }
}
