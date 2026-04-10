package com.leonardo.builder.cliente;

public abstract class ClienteBuilder {

    Cliente cliente = new Cliente();

    public abstract void buildNome();

    public abstract void buildIdade();

    public abstract void buildEndereco();

    public abstract void buildTelefone();

    public abstract void buildEmail();

    Cliente build() {
        return cliente;
    }
}
