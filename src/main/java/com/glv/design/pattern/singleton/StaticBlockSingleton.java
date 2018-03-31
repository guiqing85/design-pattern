package com.glv.design.pattern.singleton;

/**
 * Created by Apple on 18/3/31.
 * This kind of singleton can throw exception
 */
public class StaticBlockSingleton {

    private StaticBlockSingleton(){}

    private static StaticBlockSingleton instance;

    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            throw  new RuntimeException("Error on init StaticBlockSingleton.");
        }
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }
}
