package com.leonardo.abstractFactory.fabricas;

import com.leonardo.abstractFactory.carros.Hatch;
import com.leonardo.abstractFactory.carros.ICarro;

public class FabricaHatch implements IFabricaDeCarros{

    public ICarro criarCarro(String modelo, int ano, String combustivel) {
        return new Hatch(modelo, ano, combustivel);
    }
    
}
