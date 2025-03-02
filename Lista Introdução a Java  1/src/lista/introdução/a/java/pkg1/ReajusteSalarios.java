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

public class ReajusteSalarios {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanho = 5;
        double[] salarios = new double[tamanho];

        System.out.println("Digite os 5 salários:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Salário " + (i + 1) + ": ");
            salarios[i] = scanner.nextDouble();
        }

        System.out.print("Digite o valor do reajuste (sem o sinal porcentagem): ");
        double reajuste = scanner.nextDouble();

        System.out.println("\nSalarios reajustados:");
        for (int i = 0; i < tamanho; i++) {
            double salarioReajustado = salarios[i] * (1 + reajuste / 100);
            System.out.printf("Salario %d: R$ %.2f\n", (i + 1), salarioReajustado);
        }

        scanner.close();
    }
}