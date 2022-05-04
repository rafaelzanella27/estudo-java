package com.estudo.exemplos.BootCampDIOPhilips.Loops.For;

import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Fatorial: ");
        Integer fatorial = scanner.nextInt();
        Integer multiplicacao = 1;

        System.out.println(fatorial +"! = ");
        for (int i = fatorial ; i >= 1 ; i --){
            multiplicacao = multiplicacao * i;
        }

        System.out.println(multiplicacao);

    }
}
