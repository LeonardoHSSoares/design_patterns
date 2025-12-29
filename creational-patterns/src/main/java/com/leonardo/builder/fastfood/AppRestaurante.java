package com.leonardo.builder.fastfood;

public class AppRestaurante {

    public static void main(String args[]) {

        Gerente gerente = new Gerente();
    
        BurgerBuilder cheeseBurgerBuilder = new CheeseBurguerBuillder();
        gerente.setBurgerBuilder(cheeseBurgerBuilder);
        Burger cheeseBurger = gerente.criaBurger();
        cheeseBurger.exibeBurguer();


    }

}

