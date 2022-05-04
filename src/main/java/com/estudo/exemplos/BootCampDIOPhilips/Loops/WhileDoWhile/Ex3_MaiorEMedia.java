package com.estudo.exemplos.BootCampDIOPhilips.Loops.WhileDoWhile;

import java.util.Scanner;

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Integer numero;
        Integer maior = 0;
        Integer soma =0;

        Integer count =0;
        do {
            System.out.println("Numero: ");
            numero = scanner.nextInt();

            soma = soma + numero;

            if (numero > maior) maior = numero;

            count = count +1;
        } while (count < 5);

        System.out.println("Maior: " + maior);
        System.out.println("Média: " + (soma/5));


    }
}
