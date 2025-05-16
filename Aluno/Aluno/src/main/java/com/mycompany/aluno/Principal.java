/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aluno;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Coleta de dados
        System.out.print("Digite a matrícula do aluno: ");
        String matricula = input.nextLine();

        System.out.print("Digite o nome do aluno: ");
        String nome = input.nextLine();

        System.out.print("Digite a nota da primeira prova: ");
        double nota1 = input.nextDouble();

        System.out.print("Digite a nota da segunda prova: ");
        double nota2 = input.nextDouble();

        System.out.print("Digite a nota do trabalho: ");
        double notaTrabalho = input.nextDouble();

        // Instancia o objeto Aluno
         Aluno aluno = new Aluno(matricula, nome, nota1, nota2, notaTrabalho);

        // Exibe os resultados
        System.out.printf("Média final de %s: %.2f\n", aluno.getNome(), aluno.media());
        System.out.println("Situação: " + (aluno.aprovacao() ? "APROVADO" : "REPROVADO"));
    }
}