/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade;

/**
 *
 * @author Julio
 */
public class Carro {
    // Atributos privados (encapsulamento)
    private String modelo;
    private String cor;
    private int ano;
    private String marca;
    private int velocidade;

    // Construtor
    public Carro() {
        this.velocidade = 0; // Inicia parado
    }

    // Getters e Setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVelocidade() {
        return velocidade;
    }

    // Método acelera
    public void acelera(int comando) {
        if (comando == 1) {
            velocidade += 5;
        } else if (comando == -1) {
            velocidade -= 5;
            if (velocidade < 0) {
                velocidade = 0; // Velocidade não pode ser negativa
            }
        }
    }

    // Método freia
    public void freia() {
        velocidade = 0;
    }
}
