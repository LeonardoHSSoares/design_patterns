package com.leonardo.abstractFactory.fabricas;

import com.leonardo.abstractFactory.carros.ICarro;
import com.leonardo.abstractFactory.carros.Passeio;

public class FabricaPasseio implements IFabricaDeCarros{

    @Override
    public ICarro criarCarro(String modelo, int ano, String combustivel) {
        return new Passeio(modelo, ano, combustivel);
    }
    
}
