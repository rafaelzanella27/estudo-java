package com.estudo.exemplos.EqualsHascode;

import java.util.Objects;

public class Usuario {

    private String nome;
    private String sobrenome;

    public Usuario(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

//====================EQUALS E HASCODE (UTILIZANDO O CAMPO NOME E SOBRENOME)============================

    @Override
    //equals vai comparar nome e sobrenome definido no momento de adicionar a sobrescrita do método
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(nome, usuario.nome) && Objects.equals(sobrenome, usuario.sobrenome);
    }

    @Override
    //hashCode é um identificador único, sequencia de caracteres que identifica o objeto
    public int hashCode() {
        return Objects.hash(nome, sobrenome);
    }

////====================EQUALS E HASCODE (APENAS UTILIZANDO O CAMPO NOME)============================
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Usuario usuario = (Usuario) o;
//        return Objects.equals(nome, usuario.nome);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(nome);
//    }
}
