package com.leonardo.templateMethod;

public abstract class Worker {

    // Template Method
    public final void performDuties() {
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
