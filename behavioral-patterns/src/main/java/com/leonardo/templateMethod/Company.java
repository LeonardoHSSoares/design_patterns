package com.leonardo.templateMethod;

public class Company {
    public static void main(String[] args) {
        Policial policial = new Policial();
        policial.performDuties();

        System.out.println("\n");

        Bombeiro bombeiro = new Bombeiro();
        bombeiro.performDuties();
    }
}
