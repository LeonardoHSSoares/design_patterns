package com.leonardo.templateMethod;

public class Bombeiro extends Worker {

    @Override
    protected void startWork() {
        System.out.println("Bombeiro está iniciando o serviço.");
    }

    @Override
    protected void doWork() {
        System.out.println("Bombeiro está combatendo incêndios.");
    }

    @Override
    protected void takeBreak() {
        System.out.println("Bombeiro está tomando um intervalo.");
    }

    @Override
    protected void finishWork() {
        System.out.println("Bombeiro terminou o serviço.");
    }

}
