/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista.introdução.a.java.pkg1;

/**
 *
 * @author Julio
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ConsultaTelefones {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas pessoas deseja cadastrar? ");
        int quantidade = scanner.nextInt();
        scanner.nextLine();

        Map<String, String> agenda = new HashMap<>();

        for (int i = 0; i < quantidade; i++) {
            System.out.println("\nCadastro " + (i + 1) + ":");
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Telefone: ");
            String telefone = scanner.nextLine();
            agenda.put(nome, telefone);
        }

        System.out.print("\nDigite o nome para consultar o telefone: ");
        String nomeConsulta = scanner.nextLine();

        if (agenda.containsKey(nomeConsulta)) {
            System.out.println("Telefone de " + nomeConsulta + ": " + agenda.get(nomeConsulta));
        } else {
            System.out.println("Nome não encontrado na agenda.");
        }

        scanner.close();
    }
}