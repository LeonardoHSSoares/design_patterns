package com.leonardo.builder.cliente;

import com.github.javafaker.Faker;

public class ClienteConcreteBuilder extends ClienteBuilder {

    Faker faker = new Faker();

    @Override
    public void buildNome() {
        cliente.setNome(faker.name().fullName());
    }

    @Override
    public void buildIdade() {
        cliente.setIdade(faker.number().numberBetween(18, 100));
    }

    @Override
    public void buildEndereco() {
        cliente.setEndereco(faker.address().fullAddress());
    }

    @Override
    public void buildTelefone() {
        cliente.setTelefone(faker.phoneNumber().cellPhone());
    }

    @Override
    public void buildEmail() {
        cliente.setEmail(faker.internet().emailAddress());

    }
}
