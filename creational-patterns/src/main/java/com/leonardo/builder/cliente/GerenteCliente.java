package com.leonardo.builder.cliente;

public class GerenteCliente {
    
    ClienteBuilder clienteBuilder;

    public void setClienteBuilder(ClienteBuilder clienteBuilder){
        this.clienteBuilder = clienteBuilder;
    }

    public Cliente criaCliente() {
        clienteBuilder.buildNome();
        clienteBuilder.buildIdade();
        clienteBuilder.buildEndereco();
        clienteBuilder.buildTelefone();
        clienteBuilder.buildEmail();
        return clienteBuilder.build();
    }

}
