package com.leonardo.templateMethod.domain;

public abstract class Worker {

    // Template Method
    public final void executar() {
        work();
    }
    public final void work() {
        startWork();
        worker();
        takeBreak();
        endWork();
    }

    private void startWork() {
        System.out.println("Worker está começando o trabalho.");
    }
    protected abstract void worker();
    protected abstract void takeBreak();
    protected abstract void endWork();

}
