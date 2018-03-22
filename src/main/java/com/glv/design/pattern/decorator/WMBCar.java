package com.glv.design.pattern.decorator;

/**
 * Created by Apple on 18/3/22.
 */
public class WMBCar extends CarDecorator {

    public WMBCar(Car car) {
        super(car);
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("WBM car new feature, auto drive.");
    }
}
