package com.estudo.exemplos.BootCampDIOPhilips;

public class Main {
    public static void main(String[] args) {
        //Calculadora
        System.out.println("Exercício  calculadora");
        Calculadora.soma(2,2);
        Calculadora.multiplicacao(4,4);
        Calculadora.subtracao(100,10);
        Calculadora.divisao(880,6);

        //Mensagem
        System.out.println("Exercício mensagem");
        Mensagem.obterMensagem(7);
        Mensagem.obterMensagem(15);
        Mensagem.obterMensagem(22);

        //Empréstimo
        System.out.println("Exercício empréstimo");
        Emprestimo.calcular(800,Emprestimo.getDuasParcelas());
        Emprestimo.calcular(800,Emprestimo.getTresParcelas());
        Emprestimo.calcular(800,5);
    }
}
