package com.leonardo.singleton;

public class SingletonEager {
    private static final SingletonEager INSTANCE = new SingletonEager();

    private SingletonEager() {
    }

    public static SingletonEager getInstance() {
        return INSTANCE;
    }

    public void showMessage() {
        System.out.println("Eager -> " + this);
    }
}