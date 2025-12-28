package com.leonardo.abstractFactory.fabricas;

import com.leonardo.abstractFactory.carros.ICarro;

public interface IFabricaDeCarros {
    ICarro criarCarro(String modelo,int ano,String combustivel);
}
