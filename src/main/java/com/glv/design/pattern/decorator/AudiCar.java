package com.glv.design.pattern.decorator;

/**
 * Created by Apple on 18/3/22.
 */
public class AudiCar extends CarDecorator {
    public AudiCar(Car car) {
        super(car);
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("Add new feature to Audi car...");
    }
}
