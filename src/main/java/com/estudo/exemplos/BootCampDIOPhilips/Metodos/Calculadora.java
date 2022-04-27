package com.estudo.exemplos.BootCampDIOPhilips.Metodos;

public class Calculadora {

    public static void soma(double n1, double n2){
        double resultado = n1 + n2;
        System.out.println("A Soma de " + n1 + " mais " + n2 + " é igual a " + resultado);
    }

    public static void subtracao(double n1, double n2){
        double resultado = n1 - n2;
        System.out.println("A Subtração de " + n1 + " menos " + n2 + " é igual a " + resultado);
    }

    public static void multiplicacao(double n1, double n2){
        double resultado = n1 * n2;
        System.out.println("A Multiplicação de " + n1 + " vezes " + n2 + " é igual a " + resultado);
    }

    public static void divisao(double n1, double n2){
        double resultado = n1 / n2;
        System.out.println("A Divisão de " + n1 + " dividido " + n2 + " é igual a " + resultado);
    }
}
