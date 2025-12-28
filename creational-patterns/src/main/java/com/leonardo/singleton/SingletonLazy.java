package com.leonardo.singleton;

public class SingletonLazy {
    private static SingletonLazy instance;

    private SingletonLazy() {
    }

    public static SingletonLazy getInstance() {
        if (instance == null)
            instance = new SingletonLazy();
        return instance;
    }

    public void showMessage() {
        System.out.println("Lazy  -> " + this);
    }
}