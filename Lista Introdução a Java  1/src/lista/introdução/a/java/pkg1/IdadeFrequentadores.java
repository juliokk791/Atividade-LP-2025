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



public class IdadeFrequentadores {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanho = 10;
        int[] idades = new int[tamanho];

        System.out.println("Digite as idades de 10 frequentadores:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Idade " + (i + 1) + ": ");
            idades[i] = scanner.nextInt();
        }

        int maiorIdade = idades[0];
        for (int i = 1; i < tamanho; i++) {
            if (idades[i] > maiorIdade) {
                maiorIdade = idades[i];
            }
        }

        int menorIdade = idades[0];
        for (int i = 1; i < tamanho; i++) {
            if (idades[i] < menorIdade) {
                menorIdade = idades[i];
            }
        }

        int somaIdades = 0;
        for (int idade : idades) {
            somaIdades += idade;
        }
        double mediaIdades = (double) somaIdades / tamanho;

        System.out.println("\nResultados:");
        System.out.println("Maior idade: " + maiorIdade);
        System.out.println("Menor idade: " + menorIdade);
        System.out.printf("Média das idades: %.2f\n", mediaIdades);

        scanner.close();
    }
}