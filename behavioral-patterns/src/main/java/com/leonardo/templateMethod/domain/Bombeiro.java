package com.leonardo.templateMethod.domain;

public class Bombeiro extends Worker {

    @Override
    protected  void startWork() {
        System.out.println("Bombeiro está apagando incêndios.");
    }
    @Override
    protected void takeBreak() {
        System.out.println("Bombeiro está tomando um intervalo.");
    }
    @Override
    protected void endWork() {
        System.out.println("Bombeiro terminou o serviço.");
    }

}
