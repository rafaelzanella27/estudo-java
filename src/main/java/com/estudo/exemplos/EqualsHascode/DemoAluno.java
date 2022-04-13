package com.estudo.exemplos.EqualsHascode;

import java.util.HashSet;
import java.util.Set;

public class DemoAluno {

    public static void main(String[] args) {

        Set<Aluno> alunos = recuperarAlunos();

        //Aluno pesquisa = new Aluno(2, "Gui");
        Aluno pesquisa = new Aluno(2);

        Boolean existeAluno = alunos.contains(pesquisa);
        System.out.println("Existe aluno? " + existeAluno);

    }

    public static Set<Aluno> recuperarAlunos(){
        Aluno joao = new Aluno(1,"João");
        Aluno maria = new Aluno(2,"Maria");
        Aluno davi = new Aluno(3,"Davi");

        Set<Aluno> alunos = new HashSet<Aluno>();
        alunos.add(joao);
        alunos.add(maria);
        alunos.add(davi);

        return alunos;
    }

    }

