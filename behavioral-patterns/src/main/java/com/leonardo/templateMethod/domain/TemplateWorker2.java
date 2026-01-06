package com.leonardo.templateMethod.domain;

public abstract class TemplateWorker2 {

    public void work() {
        startWork();
        takeBreak();
        endWork();
    }

    protected abstract void run();

    private void startWork() {
        System.out.println("Está começando o trabalho.");
    }
    private void takeBreak() {
        System.out.println("Está fazendo uma pausa.");
    }
    private void endWork() {
        System.out.println("Terminou o trabalho.");
    }
}
