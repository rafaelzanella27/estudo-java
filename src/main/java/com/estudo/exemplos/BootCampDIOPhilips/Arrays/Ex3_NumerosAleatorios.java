package com.estudo.exemplos.BootCampDIOPhilips.Arrays;

import java.util.Random;

public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        Integer[] numerosAletorios = new Integer[5];

        for (int i = 0; i < numerosAletorios.length; i++){
            Integer numero = random.nextInt(100);
            numerosAletorios[i] = numero;
        }

        System.out.println("Números Aleatorios: ");
        for (Integer numero: numerosAletorios) {
            System.out.println(numero + " ");
        }

        System.out.println("\nNúmeros Sucessores: ");
        for (Integer numero: numerosAletorios) {
            System.out.println((numero+1) + " ");
        }

        System.out.println("\nNúmeros Antecessores: ");
        for (Integer numero: numerosAletorios) {
            System.out.println((numero-1) + " ");
        }
    }
}
