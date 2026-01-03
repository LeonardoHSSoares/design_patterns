package com.leonardo.builder.carros;

public abstract class CarroBuilder {

    Carro carro = new Carro();

    public abstract void buildModelo();
    public abstract void buildMotor();
    public abstract void buildCor();
    public abstract void buildAno();
    public abstract void buildCombustivel();
    public abstract void buildMarca();

    public Carro criarCarro() {
        return carro;
    }
}
