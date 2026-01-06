package com.leonardo.templateMethod;

import com.leonardo.templateMethod.domain.Bombeiro;
import com.leonardo.templateMethod.domain.Cozinheiro;
import com.leonardo.templateMethod.domain.Policial;

public class Company {
    public static void main(String[] args) {
        Policial policial = new Policial();
        Bombeiro bombeiro = new Bombeiro();
        Cozinheiro cozinheiro = new Cozinheiro();

        System.out.println("\n");
        System.out.println("Policial com metodo run()");
        policial.run();
        System.out.println("\n");
        System.out.println("policial com metodo work()");
        policial.work();

        System.out.println("\n");
        
        System.out.println("Bombeiro com metodo work()");
        bombeiro.work();

        System.out.println("\n");
        System.out.println("Bombeiro com metodo run()");
        bombeiro.run();

        System.out.println("\n");
        System.out.println("Cozinheiro com metodo run()");
        cozinheiro.run();

    }
}
