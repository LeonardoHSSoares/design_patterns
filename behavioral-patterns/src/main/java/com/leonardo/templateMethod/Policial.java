package com.leonardo.templateMethod;

public class Policial extends Worker {

    @Override
    protected void startWork() {
        System.out.println("Policial está iniciando o serviço.");
    }

    @Override
    protected void doWork() {
        System.out.println("Policial está mantendo a ordem pública.");
    }

    @Override
    protected void takeBreak() {
        System.out.println("Policial está tomando um intervalo.");
    }

    @Override
    protected void finishWork() {
        System.out.println("Policial terminou o serviço.");
    }
}
