package com.leonardo.templateMethod.domain;

public class Policial extends Worker {

    @Override
    protected void worker() {
        System.out.println("Policial está mantendo a ordem pública.");
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
