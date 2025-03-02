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

public class ExibirOrdemInversa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanho = 10;
        int[] valores = new int[tamanho];

        System.out.println("Digite 10 valores inteiros:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            valores[i] = scanner.nextInt();
        }

        System.out.println("\nValores na ordem inversa:");
        for (int i = tamanho - 1; i >= 0; i--) {
            System.out.println("Valor " + (i + 1) + ": " + valores[i]);
        }

        scanner.close();
    }
}