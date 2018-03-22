package com.glv.design.pattern.decorator;

/**
 * Created by Apple on 18/3/22.
 */
public class CarDecorator implements Car {

    protected Car car;

    public CarDecorator(Car car){
        this.car = car;
    }

    @Override
    public void drive() {
        car.drive();
    }
}

