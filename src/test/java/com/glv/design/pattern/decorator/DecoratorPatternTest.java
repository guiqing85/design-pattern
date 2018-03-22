package com.glv.design.pattern.decorator;

import org.junit.Test;

/**
 * Created by Apple on 18/3/22.
 */
public class DecoratorPatternTest{

    @Test
    public void testDrive() {
        Car car = new WMBCar(new BasicCar());
        car.drive();

        car = new AudiCar(new BasicCar());
        car.drive();
    }
}
