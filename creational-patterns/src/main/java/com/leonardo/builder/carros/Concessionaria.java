package com.leonardo.builder.carros;

public class Concessionaria {

    public static void main(String[] args) {
        DiretorConcessionaria concessionaria = new DiretorConcessionaria();

        CarroBuilder suvBuilder = new FordBuilder();
        concessionaria.setCarroBuilder(suvBuilder);
        Carro suv = concessionaria.criaCarro();
        suv.exibeInfo();
    }
}
