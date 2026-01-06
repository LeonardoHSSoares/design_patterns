package com.leonardo.templateMethod.domain;

public abstract class TemplateWorker {

    // Template Method
    public final void run() {
        work();
    }
    public void work() {
        startWork();
        takeBreak();
        endWork();
    }
    
    protected abstract String getWorker();
    protected abstract void startWork();
    protected abstract void takeBreak();
    protected abstract void endWork();
}
