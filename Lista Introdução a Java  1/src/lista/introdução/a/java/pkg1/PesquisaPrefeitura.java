/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista.introdução.a.java.pkg1;

/**
 *
 * @author Julio
 */
import java.util.Scanner;

public class PesquisaPrefeitura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantidade de entrevistados: ");
        int quantidade = scanner.nextInt();

        double[] salarios = new double[quantidade];
        int[] filhos = new int[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.println("\nEntrevistado " + (i + 1) + ":");
            System.out.print("Salário: R$ ");
            salarios[i] = scanner.nextDouble();
            System.out.print("Número de filhos: ");
            filhos[i] = scanner.nextInt();
        }

        calcularEstatisticas(salarios, filhos);

        scanner.close();
    }

    public static void calcularEstatisticas(double[] salarios, int[] filhos) {
        int quantidade = salarios.length;

        double somaSalarios = 0;
        for (double salario : salarios) {
            somaSalarios += salario;
        }
        double mediaSalario = somaSalarios / quantidade;

        int somaFilhos = 0;
        for (int numFilhos : filhos) {
            somaFilhos += numFilhos;
        }
        double mediaFilhos = (double) somaFilhos / quantidade;

        double maiorSalario = salarios[0];
        for (double salario : salarios) {
            if (salario > maiorSalario) {
                maiorSalario = salario;
            }
        }

        int countSalarioAte550 = 0;
        for (double salario : salarios) {
            if (salario <= 550.00) {
                countSalarioAte550++;
            }
        }
        double percentualAte550 = (double) countSalarioAte550 / quantidade * 100;

        System.out.println("\nResultados da Pesquisa:");
        System.out.printf("Média de salário: R$ %.2f\n", mediaSalario);
        System.out.printf("Média de filhos: %.2f\n", mediaFilhos);
        System.out.printf("Maior salário: R$ %.2f\n", maiorSalario);
        System.out.printf("Percentual de pessoas com salário até R$550,00: %.2f%%\n", percentualAte550);
    }
}