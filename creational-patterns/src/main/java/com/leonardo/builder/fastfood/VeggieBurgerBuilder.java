package com.leonardo.builder.fastfood;

public class VeggieBurgerBuilder extends BurgerBuilder {

    @Override
    public void buildBun() {
        burger.setBun("Whole Grain Bun");
    }

    @Override
    public void buildPatty() {
        burger.setPatty("Vegan Patty");
    }

    @Override
    public void buildCheese() {
        burger.setCheese("Vegan Cheese");
    }

    @Override
    public void buildSauce() {
        burger.setSauce("Hummus Sauce");
    }

    @Override
    public void buildVeggies() {
        burger.setVeggies("Grilled Mushrooms, Spinach, Avocado");
    }


}
