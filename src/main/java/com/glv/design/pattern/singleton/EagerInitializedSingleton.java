package com.glv.design.pattern.singleton;

/**
 * Created by Apple on 18/3/30.
 */
public class EagerInitializedSingleton {

    //private construct to prevent create instance by external using new EagerInitializedSingleton()
    private  EagerInitializedSingleton() {}
    //create instance after classloader load this class
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    //public static method for client to get instance
    public static EagerInitializedSingleton getInstance() {
        return instance;
    }

}
