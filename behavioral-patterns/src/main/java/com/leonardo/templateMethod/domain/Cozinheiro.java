package com.leonardo.templateMethod.domain;

public class Cozinheiro extends TemplateWorker{

    @Override
    protected String getWorker() {
        return "Cozinheiro";
    }

    @Override
    protected void startWork() {
        System.out.println(getWorker()+" comecou a cozinhar o almoço.");
    }

    @Override
    protected void takeBreak() {
        System.out.println(getWorker()+" comecou a pausa de descanso.");
    }

    @Override
    protected void endWork() {
        System.out.println(getWorker()+" finalizou o serviço da cozinha.");
    }

    
}
