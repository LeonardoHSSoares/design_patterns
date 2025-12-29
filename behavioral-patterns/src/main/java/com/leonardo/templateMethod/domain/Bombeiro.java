package com.leonardo.templateMethod.domain;

public class Bombeiro extends TemplateWorker2 {

    @Override
    public void run() {
        startWork();
        takeBreak();
        endWork();
    }
    
    private void startWork() {
        System.out.println("Bombeiro está combatendo o fogo.");
    }
    private void takeBreak() {
        System.out.println("Bombeiro está descansando após o combate.");
    }
    private void endWork() {
        System.out.println("Bombeiro terminou o serviço.");
    }
    



}
