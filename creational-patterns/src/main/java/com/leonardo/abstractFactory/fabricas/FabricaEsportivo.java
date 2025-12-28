package com.leonardo.abstractFactory.fabricas;

import com.leonardo.abstractFactory.carros.Esportivo;
import com.leonardo.abstractFactory.carros.ICarro;

public class FabricaEsportivo implements IFabricaDeCarros{

    public ICarro criarCarro(String modelo, int ano, String combustivel) {
        return new Esportivo(modelo, ano, combustivel);
    }
    
}
