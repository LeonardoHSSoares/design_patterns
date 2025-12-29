package com.leonardo.templateMethod.domain;

public abstract class Worker {


    // Template Method
    public final void work() {
        startWork();
        takeBreak();
        endWork();
    }

    protected abstract void startWork();
    protected abstract void takeBreak();
    protected abstract void endWork();



}
