package com.leonardo.builder.carros;

public class DiretorConcessionaria {

    CarroBuilder carroBuilder;
    
    public void setCarroBuilder(CarroBuilder carroBuilder) {
        this.carroBuilder = carroBuilder;
    }

    public Carro criaCarro() {
        carroBuilder.buildMarca();
        carroBuilder.buildModelo();
        carroBuilder.buildAno();
        carroBuilder.buildCor();
        carroBuilder.buildMotor();
        carroBuilder.buildCombustivel();
        return carroBuilder.criarCarro();
    }
}
