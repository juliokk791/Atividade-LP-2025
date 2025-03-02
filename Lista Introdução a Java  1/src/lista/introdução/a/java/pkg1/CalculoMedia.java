/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista.introdução.a.java.pkg1;

import java.util.Scanner;

/**
 *
 * @author Julio
 */
public class CalculoMedia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota da Prova 1: ");
        double prova1 = scanner.nextDouble();

        System.out.print("Digite a nota da Prova 2: ");
        double prova2 = scanner.nextDouble();

        System.out.print("Digite a nota da Prova 3: ");
        double prova3 = scanner.nextDouble();

        double media = (prova1 + prova2 + prova3) / 3;

        System.out.printf("Media inicial: %.2f\n", media);

        if (media >= 7.0) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno em recuperaçao.");

            System.out.print("Digite a nota da Recuperaçao: ");
            double recuperacao = scanner.nextDouble();

            double mediaFinal = (media + recuperacao) / 2;

            System.out.printf("Media final: %.2f\n", mediaFinal);
            if (mediaFinal >= 5.0) {
                System.out.println("Aluno aprovado apos recuperaçao!");
            } else {
                System.out.println("Aluno reprovado.");
            }
        }

        scanner.close();
    }
}
