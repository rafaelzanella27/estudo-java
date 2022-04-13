package com.estudo.exemplos.EqualsHascode;

import java.util.Objects;

public class Aluno {

    private Integer codigo;
    private String nome;

    public Aluno(Integer codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public Aluno(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(codigo, aluno.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }
}
