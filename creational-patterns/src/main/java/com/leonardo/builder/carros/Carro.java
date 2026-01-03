package com.leonardo.builder.carros;

public class Carro {

    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private String motor;
    private String combustivel;

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public void exibeInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
        System.out.println("Motor: " + motor);
        System.out.println("Combustível: " + combustivel);
    }

}
