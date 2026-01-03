package com.leonardo.builder.carros;

import com.github.javafaker.Faker;

public class FordBuilder extends CarroBuilder {

    Faker faker = new Faker();

    @Override
    public void buildModelo() {
        carro.setModelo(faker.pokemon().name());
    }

    @Override
    public void buildMotor() {
        carro.setMotor(faker.number().digit() + ".0 Turbo");
    }

    @Override
    public void buildCor() {
        carro.setCor(faker.color().name());
    }

    @Override
    public void buildAno() {
        carro.setAno(faker.number().numberBetween(2000, 2024));
    }

    @Override
    public void buildCombustivel() {
        carro.setCombustivel(faker.options().option("Gasolina", "Diesel", "Flex", "Elétrico"));
    }

    @Override
    public void buildMarca() {
        carro.setMarca("Ford");
    }


}
