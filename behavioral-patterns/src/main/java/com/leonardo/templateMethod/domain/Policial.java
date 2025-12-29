package com.leonardo.templateMethod.domain;

public class Policial extends TemplateWorker {

    @Override
    protected void startWork() {
        System.out.println("Policial está patrulhando a área.");
    }
    
    @Override
    protected void takeBreak() {
        System.out.println("Policial está tomando um café.");
    }

    @Override
    protected void endWork() {
        System.out.println("Policial terminou o serviço.");
    }

}
