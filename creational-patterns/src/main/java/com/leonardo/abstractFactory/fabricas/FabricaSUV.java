package com.leonardo.abstractFactory.fabricas;

import com.leonardo.abstractFactory.carros.ICarro;
import com.leonardo.abstractFactory.carros.SUV;

public class FabricaSUV implements IFabricaDeCarros{

    @Override
    public ICarro criarCarro(String modelo, int ano, String combustivel) {
        return new SUV(modelo, ano,combustivel);
    }

    
    
}
