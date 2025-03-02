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

public class MelhorDesconto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de livros que deseja comprar: ");
        int quantidadeLivros = scanner.nextInt();

        double descontoA = (0.25 * quantidadeLivros) + 7.50;
        double descontoB = (0.50 * quantidadeLivros) + 2.50;

        System.out.printf("Desconto pelo Criterio A: R$ %.2f\n", descontoA);
        System.out.printf("Desconto pelo Criterio B: R$ %.2f\n", descontoB);

        if (descontoA < descontoB) {
            System.out.println("O Criterio A e mais vantajoso.");
        } else if (descontoB < descontoA) {
            System.out.println("O Critério B e mais vantajoso.");
        } else {
            System.out.println("Ambos os criterios oferecem o mesmo desconto.");
        }

        scanner.close();
    }
}