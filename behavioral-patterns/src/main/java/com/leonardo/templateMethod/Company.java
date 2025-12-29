package com.leonardo.templateMethod;

import com.leonardo.templateMethod.domain.Bombeiro;
import com.leonardo.templateMethod.domain.Policial;

public class Company {
    public static void main(String[] args) {
        Policial policial = new Policial();
        policial.work();
        
        System.out.println("\n");

        Bombeiro bombeiro = new Bombeiro();
        bombeiro.work();
        
        
    }
}
