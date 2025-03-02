/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista.introdução.a.java.pkg1;

/**
 *
 * @author Julio
 */
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class InterseccaoConjuntos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        System.out.print("Quantos numeros cada conjunto tera? ");
        int quantidade = scanner.nextInt();

        Set<Integer> conjunto1 = new HashSet<>();
        Set<Integer> conjunto2 = new HashSet<>();

        System.out.println("\nDigite os numeros do primeiro conjunto:");
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            conjunto1.add(scanner.nextInt());
        }

        System.out.println("\nDigite os numeros do segundo conjunto:");
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            conjunto2.add(scanner.nextInt());
        }

        // Calcula a interseção dos conjuntos
        Set<Integer> intersecao = new HashSet<>(conjunto1);
        intersecao.retainAll(conjunto2); 

        if (intersecao.isEmpty()) {
            System.out.println("\nNão há números repetidos nos dois conjuntos.");
        } else {
            System.out.println("\nNúmeros repetidos nos dois conjuntos (interseçao):");
            for (int numero : intersecao) {
                System.out.println(numero);
            }
        }

        scanner.close();
    }
}