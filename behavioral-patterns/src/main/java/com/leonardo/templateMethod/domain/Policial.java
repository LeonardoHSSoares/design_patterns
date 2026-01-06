package com.leonardo.templateMethod.domain;

public class Policial extends TemplateWorker {

    @Override
    protected String getWorker() {
        return "Policial";
    }

    @Override
    protected void startWork() {
        System.out.println(getWorker() + " está patrulhando a área.");
    }
    
    @Override
    protected void takeBreak() {
        System.out.println(getWorker() + " está tomando um café.");
    }

    @Override
    protected void endWork() {
        System.out.println(getWorker() + " terminou o serviço.");
    }

}
