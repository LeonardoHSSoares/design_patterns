package com.leonardo.builder.fastfood;

import com.github.javafaker.Faker;

public class CheeseBurguerBuillder extends BurgerBuilder {

    Faker faker = new Faker();
    
    @Override
    public void buildBun() {
        burger.setBun(faker.food().ingredient() + " Bun");
    }

    @Override
    public void buildPatty() {
        burger.setPatty(faker.food().fruit() + " Patty");
    }

    @Override
    public void buildCheese() {
        burger.setCheese(faker.food().measurement() + " Cheese");
    }

    @Override
    public void buildSauce() {
        burger.setSauce(faker.food().spice() + " Sauce");
    }

    @Override
    public void buildVeggies() {
        burger.setVeggies(faker.food().vegetable());

    }

}
