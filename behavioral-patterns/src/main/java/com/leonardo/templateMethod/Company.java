package com.leonardo.templateMethod;

import com.leonardo.templateMethod.domain.Bombeiro;
import com.leonardo.templateMethod.domain.Policial;

public class Company {
    public static void main(String[] args) {
        Policial policial = new Policial();
        Bombeiro bombeiro = new Bombeiro();

        policial.executar();

        System.out.println("\n");
        
        bombeiro.work();

    }
}
