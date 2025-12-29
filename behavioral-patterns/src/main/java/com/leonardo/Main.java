package com.leonardo;

import com.leonardo.templateMethod.Bombeiro;
import com.leonardo.templateMethod.Policial;

public class Main {
    public static void main(String[] args) {
        Policial policial = new Policial();
        policial.performDuties();

        System.out.println("\n");

        Bombeiro bombeiro = new Bombeiro();
        bombeiro.performDuties();
    }
}