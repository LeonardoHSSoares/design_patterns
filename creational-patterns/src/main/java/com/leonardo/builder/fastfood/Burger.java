package com.leonardo.builder.fastfood;

public class Burger {

    private String bun = "No Bread" ;
    private String patty = "No Patty"; 
    private String cheese = "No Cheese";
    private String sauce = "No Sauce";
    private String veggies = "No Veggies";

    public void setBun(String bun) {
        this.bun = bun;
    }
    public void setPatty(String patty) {
        this.patty = patty;
    }
    public void setCheese(String cheese) {
        this.cheese = cheese;
    }
    public void setSauce(String sauce) {
        this.sauce = sauce;
    }
    public void setVeggies(String veggies) {
        this.veggies = veggies;
    }
    
    public void exibeBurguer() {
        System.out.println("Burger with: ");
        System.out.println("Bun: " + bun);
        System.out.println("Patty: " + patty);
        System.out.println("Cheese: " + cheese);
        System.out.println("Sauce: " + sauce);
        System.out.println("Veggies: " + veggies);
    }
}
