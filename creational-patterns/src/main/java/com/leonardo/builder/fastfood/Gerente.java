package com.leonardo.builder.fastfood;

public class Gerente {

    BurgerBuilder burgerBuilder;

    public void setBurgerBuilder(BurgerBuilder burgerBuilder) {
        this.burgerBuilder = burgerBuilder;
    }


    public Burger criaBurger() {
        burgerBuilder.buildBun();
        burgerBuilder.buildPatty();
        burgerBuilder.buildCheese();
        burgerBuilder.buildSauce();
        burgerBuilder.buildVeggies();
        return burgerBuilder.build();
    }
    



}
