package com.leonardo.builder.fastfood;

public class VegetablesBurgerBuilder extends BurgerBuilder {

    @Override
    public void buildBun() {
        burger.setBun("Whole Grain Bun");
        throw new UnsupportedOperationException("Unimplemented method 'buildBun'");
    }

    @Override
    public void buildPatty() {
        burger.setPatty("Vegan Patty");
        throw new UnsupportedOperationException("Unimplemented method 'buildPatty'");
    }

    @Override
    public void buildCheese() {
        burger.setCheese("Vegan Cheese");
        throw new UnsupportedOperationException("Unimplemented method 'buildCheese'");
    }

    @Override
    public void buildSauce() {
        burger.setSauce("Hummus Sauce");
        throw new UnsupportedOperationException("Unimplemented method 'buildSauce'");
    }

    @Override
    public void buildVeggies() {
        burger.setVeggies("Grilled Mushrooms, Spinach, Avocado");
        throw new UnsupportedOperationException("Unimplemented method 'buildVeggies'");
    }


}
