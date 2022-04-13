package com.estudo.exemplos.EqualsHascode;

public class DemoUsuario {

    public static void main(String[] args) {
        Usuario usuarioA = new Usuario("Rafael", "Zanella");
        Usuario usuarioB = new Usuario("Rafael", "Rodrigues");

        System.out.println(usuarioA);
        System.out.println(usuarioA.hashCode());
        System.out.println(usuarioB);
        System.out.println(usuarioB.hashCode());
        System.out.println(usuarioA.equals(usuarioB));
    }
}
