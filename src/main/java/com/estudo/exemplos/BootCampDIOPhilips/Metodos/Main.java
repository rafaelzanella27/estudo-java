package com.estudo.exemplos.BootCampDIOPhilips.Metodos;

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

        //Sobrecarga de método
        System.out.println("Exemplo quadrilátero");
        Sobrecarga.area(3);
        Sobrecarga.area(5,5);
        Sobrecarga.area(7,8,9);

        //Métodos com Retornos
        System.out.println("Exemplo retornos");
        double areaQuadrado = MetodosComRetorno.area(3);
        System.out.println("Área do quadrado:" + areaQuadrado);

        double areaRetangulo = MetodosComRetorno.area(5,5);
        System.out.println("Área do retângulo:" + areaRetangulo);

        double areaTrapezio = MetodosComRetorno.area(7,8,9);
        System.out.println("Área do trapézio:" + areaTrapezio);
    }
}
