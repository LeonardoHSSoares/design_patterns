package com.leonardo.singleton;

public class SingletonHolder {
    private SingletonHolder() {
    }

    private static class Holder {
        static final SingletonHolder INSTANCE = new SingletonHolder();
    }

    public static SingletonHolder getInstance() {
        return Holder.INSTANCE;
    }

    public void showMessage() {
        System.out.println("Instância Holder: " + this);
    }
}
