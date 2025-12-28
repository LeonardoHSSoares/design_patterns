package com.leonardo.abstractFactory;

import com.leonardo.abstractFactory.carros.ICarro;
import com.leonardo.abstractFactory.fabricas.FabricaEsportivo;
import com.leonardo.abstractFactory.fabricas.FabricaHatch;
import com.leonardo.abstractFactory.fabricas.FabricaPasseio;
import com.leonardo.abstractFactory.fabricas.FabricaSUV;
import com.leonardo.abstractFactory.fabricas.FabricaSedan;
import com.leonardo.abstractFactory.fabricas.IFabricaDeCarros;

public class FabricaLeonardo {
    public static void main(String[] args) {
        IFabricaDeCarros leonardoPasseio = new FabricaPasseio();
        ICarro palio = leonardoPasseio.criarCarro("Palio", 1995, "Gasolina");
        palio.exibirInfo();

        IFabricaDeCarros leonardoEsportivo = new FabricaEsportivo();
        ICarro pulseT270 = leonardoEsportivo.criarCarro("Pulse Abarth", 2022, "Flex");
        pulseT270.exibirInfo();

        IFabricaDeCarros leonardoSUV = new FabricaSUV();
        ICarro fastBackAT6 = leonardoSUV.criarCarro("Argo Fastback", 2023, "Flex");
        fastBackAT6.exibirInfo();

        IFabricaDeCarros leonardoSedan = new FabricaSedan();
        ICarro firefly = leonardoSedan.criarCarro("Argo Sedan", 2023, "Flex");
        firefly.exibirInfo();

        IFabricaDeCarros leonardoHatch = new FabricaHatch();
        ICarro hatchCarro = leonardoHatch.criarCarro("Mobi", 2022, "Gasolina");
        hatchCarro.exibirInfo();

    }
}
