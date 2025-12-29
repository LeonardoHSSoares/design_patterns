package com.leonardo.builder.fastfood;

public abstract class BurgerBuilder {

    Burger burger = new Burger();

    public abstract void buildBun();

    public abstract void buildPatty();

    public abstract void buildCheese();

    public abstract void buildSauce();

    public abstract void buildVeggies();

    Burger build() {
        return burger;
    }
}
