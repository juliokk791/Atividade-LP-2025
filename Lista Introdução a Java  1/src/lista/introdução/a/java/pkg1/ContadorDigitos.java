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

public class ContadorDigitos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero inteiro maior ou igual a 0: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("Numero inválido. Por favor, insira um valor maior ou igual a 0.");
           
        } else {
            int quantidadeDigitos = contarDigitos(numero);

            System.out.println("O numero de dígitos é: " + quantidadeDigitos);
        }

        scanner.close();
    }


    private static int contarDigitos(int numero) {
        if (numero == 0) {
            return 1; // o
        }

        int contador = 0;
        while (numero != 0) {
            numero /= 10; 
            contador++;
        }

        return contador;
    }
}