/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.aluno;

/**
 *
 * @author aluno
 */
public class Aluno {
    private final String matricula;
    private final String nome;
    private final double notaProva1;
    private final double notaProva2;
    private final double notaTrabalho;

    public Aluno(String matricula, String nome, double notaProva1, double notaProva2, double notaTrabalho) {
        this.matricula = matricula;
        this.nome = nome;
        this.notaProva1 = notaProva1;
        this.notaProva2 = notaProva2;
        this.notaTrabalho = notaTrabalho;
    }

    public double media() {
        return ((notaProva1 * 2.5) + (notaProva2 * 2.5) + (notaTrabalho * 2)) / 7;
    }
    public boolean aprovacao() {
        return media() >= 6.0;
    }
    public String getNome() {
        return nome;
    }
    public String getMatricula() {
        return matricula;
    }
}