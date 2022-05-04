package com.estudo.exemplos.BootCampDIOPhilips.Arrays;

import java.util.Random;

public class Ex4_ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();

        Integer[][] M = new Integer[4][4];

        for (int i = 0; i < M.length; i++){
            for (int j = 0; j < M[i].length; j++){
                M[i][j] = random.nextInt(9);
            }
        }

        System.out.println("Matriz: ");
        for (Integer[] linha : M) {
            for (Integer coluna : linha) {
                System.out.println(coluna + " ");
            }
            System.out.println();
        }
    }
}
