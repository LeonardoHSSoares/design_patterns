package com.leonardo.abstractFactory.fabricas;

import com.leonardo.abstractFactory.carros.ICarro;
import com.leonardo.abstractFactory.carros.Sedan;

/**
 * FabricaSedan
 */
public class FabricaSedan implements IFabricaDeCarros{

    @Override
    public ICarro criarCarro(String modelo, int ano, String combustivel) {
        return new Sedan(modelo,ano,combustivel);
    }

    
}