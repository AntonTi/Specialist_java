package com.anti.specialist;

public class Singleton {
    private static Singleton instance;
    public String data;

    private Singleton() {
        data = "Hi";
    }

    public static Singleton getInstance() {
        if (instance == null)
            instance = new Singleton();
        return instance;
    }

}
