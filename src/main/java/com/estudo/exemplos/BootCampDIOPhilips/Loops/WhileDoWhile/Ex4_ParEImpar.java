package com.estudo.exemplos.BootCampDIOPhilips.Loops.WhileDoWhile;

import java.util.Scanner;

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer quantNumeros;
        Integer numero;
        Integer quantPares = 0;
        Integer quantImpares = 0;

        System.out.println("Quantidade de números: ");
        quantNumeros = scanner.nextInt();

        Integer count = 0;

        do {
            System.out.println("Número: ");
            numero = scanner.nextInt();

            if (numero % 2 == 0) quantPares++; //quantPares = quantPares + 1;
            else quantImpares++;

            count++;
        } while (count < quantNumeros);

        System.out.println("Quantidade Par: " + quantPares);
        System.out.println("Quantidade Impar: " + quantImpares);
    }
}
