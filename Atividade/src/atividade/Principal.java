/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade;

import java.util.Scanner;

/**
 *
 * @author Julio
 */ 
public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carro meuCarro = new Carro();

        // Solicitar dados do usuário
        System.out.print("Digite o modelo do carro: ");
        meuCarro.setModelo(scanner.nextLine());

        System.out.print("Digite a cor do carro: ");
        meuCarro.setCor(scanner.nextLine());

        System.out.print("Digite o ano do carro: ");
        meuCarro.setAno(scanner.nextInt());
        scanner.nextLine(); // Limpar buffer

        System.out.print("Digite a marca do carro: ");
        meuCarro.setMarca(scanner.nextLine());

        System.out.println("\nCarro cadastrado:");
        System.out.println("Modelo: " + meuCarro.getModelo());
        System.out.println("Cor: " + meuCarro.getCor());
        System.out.println("Ano: " + meuCarro.getAno());
        System.out.println("Marca: " + meuCarro.getMarca());
        System.out.println("Velocidade atual: " + meuCarro.getVelocidade() + " km/h");

        // Testar métodos
        meuCarro.acelera(1);
        System.out.println("Acelerando... Velocidade: " + meuCarro.getVelocidade() + " km/h");

        meuCarro.acelera(-1);
        System.out.println("Desacelerando... Velocidade: " + meuCarro.getVelocidade() + " km/h");

        meuCarro.freia();
        System.out.println("Freando... Velocidade: " + meuCarro.getVelocidade() + " km/h");

        scanner.close();
    }
}
