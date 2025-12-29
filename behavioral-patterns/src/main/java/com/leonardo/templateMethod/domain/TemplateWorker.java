package com.leonardo.templateMethod.domain;

public abstract class TemplateWorker {

    // Template Method
    public final void run() {
        
    }
    public void work() {
        startWork();
        takeBreak();
        endWork();
    }

    protected abstract void startWork();
    protected abstract void takeBreak();
    protected abstract void endWork();
}
