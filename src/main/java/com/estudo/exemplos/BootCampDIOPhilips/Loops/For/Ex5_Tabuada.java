package com.estudo.exemplos.BootCampDIOPhilips.Loops.For;

import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Tabuada: ");
        Integer tabuada = scanner.nextInt();

        System.out.println("Tabuada de " + tabuada);

        for (int i = 1 ; i <=10 ; i++ ){
            System.out.println(tabuada + " X " + i + " = " + (tabuada*i));
        }
    }
}
