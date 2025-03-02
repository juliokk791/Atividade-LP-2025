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

public class CategoriaNadador {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade do nadador: ");
        int idade = scanner.nextInt();

        determinarCategoria(idade);

        scanner.close();
    }

    // Procedimento para determinar a categoria do nadador
    public static void determinarCategoria(int idade) {
        if (idade <= 0) {
            System.out.println("Idade inválida! A idade deve ser maior que zero.");
        } else if (idade >= 5 && idade <= 7) {
            System.out.println("Categoria: Infantil A");
        } else if (idade >= 8 && idade <= 10) {
            System.out.println("Categoria: Infantil B");
        } else if (idade >= 11 && idade <= 13) {
            System.out.println("Categoria: Juvenil A");
        } else if (idade >= 14 && idade <= 17) {
            System.out.println("Categoria: Juvenil B");
        } else if (idade >= 18) {
            System.out.println("Categoria: Adulto");
        } else {
            System.out.println("Idade invalida! Não ha categoria para essa idade.");
        }
    }
}