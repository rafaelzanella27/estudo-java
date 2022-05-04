package com.estudo.exemplos.BootCampDIOPhilips.Arrays;

import java.util.Scanner;

public class Ex2_Consoantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] consoantes = new String[6];

        Integer qtdeConsoantes = 0;

        Integer count = 0;
        do {
            System.out.println("Letra: ");
            String letra = scanner.next();

            if (!(letra.equalsIgnoreCase("a") ||
                    letra.equalsIgnoreCase("e") ||
                    letra.equalsIgnoreCase("i") ||
                    letra.equalsIgnoreCase("o") ||
                    letra.equalsIgnoreCase("u")) ){
                consoantes[count] = letra;
                qtdeConsoantes++;
            }

            count++;

        } while (count < consoantes.length);

        System.out.println("Consoantes: ");
        for (String consoante : consoantes ) {
            if (consoante != null)
            System.out.println(consoante);
        }
        System.out.println("Quantidade de consoantes: " + qtdeConsoantes);
    }
}
