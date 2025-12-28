package com.leonardo.singleton;

public class MainSingleton {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("== Exemplos de Singleton ==");
        SingletonEager.getInstance().showMessage();
        SingletonLazy.getInstance().showMessage();
        SingletonDCL.getInstance().showMessage();
        SingletonHolder.getInstance().showMessage();

        System.out.println("\n== Teste concorrente (threads) ==");
        Runnable r = () -> {
            System.out.println(Thread.currentThread().getName() + " -> Lazy: " + SingletonLazy.getInstance());
            System.out.println(Thread.currentThread().getName() + " -> DCL : " + SingletonDCL.getInstance());
        };

        Thread t1 = new Thread(r, "T1");
        Thread t2 = new Thread(r, "T2");
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("\nPronto.");
    }
}
