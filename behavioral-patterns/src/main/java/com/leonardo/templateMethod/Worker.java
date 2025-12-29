package com.leonardo.templateMethod;

public abstract class Worker {


    public final void executar() {
        work();
    }
    // Template Method
    public final void work() {
        startWork();
        doWork();
        takeBreak();
        finishWork();
    }

    protected abstract void startWork();

    protected abstract void doWork();

    protected abstract void takeBreak();

    protected abstract void finishWork();



}
