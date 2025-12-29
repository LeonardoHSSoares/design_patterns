package com.leonardo.templateMethod.domain;

public abstract class TemplateWorker2 {

    public void worker() {
        startWork();
        takeBreak();
        endWork();
    }

    protected abstract void run();

    private void startWork() {
        System.out.println("Trabalhador está começando o trabalho.");
    }
    private void takeBreak() {
        System.out.println("Trabalhador está fazendo uma pausa.");
    }
    private void endWork() {
        System.out.println("Trabalhador terminou o trabalho.");
    }
}
