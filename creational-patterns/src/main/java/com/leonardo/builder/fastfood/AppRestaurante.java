package com.leonardo.builder.fastfood;

public class AppRestaurante {

    public static void main(String args[]) {

        Gerente gerente = new Gerente();
    
        BurgerBuilder cheeseBurgerBuilder = new CheeseBurguerBuilder();
        gerente.setBurgerBuilder(cheeseBurgerBuilder);
        Burger cheeseBurger = gerente.criaBurger();
        cheeseBurger.exibeBurguer();

        BurgerBuilder veggieBurgerBuilder = new VeggieBurgerBuilder();
        gerente.setBurgerBuilder(veggieBurgerBuilder);
        Burger veggieBurger = gerente.criaBurger();
        veggieBurger.exibeBurguer();


    }

}

