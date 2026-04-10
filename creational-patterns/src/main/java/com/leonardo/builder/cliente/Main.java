package com.leonardo.builder.cliente;

public class Main {

    public static void main(String[] args) {
        GerenteCliente gerente = new GerenteCliente();
        ClienteBuilder clienteBuilder = new ClienteConcreteBuilder();
        gerente.setClienteBuilder(clienteBuilder);
        Cliente cliente = gerente.criaCliente();
        cliente.exibirInfo();
    }
}
