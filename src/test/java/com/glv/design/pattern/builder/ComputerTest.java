package com.glv.design.pattern.builder;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Apple on 18/3/25.
 */
public class ComputerTest {

    @Test
    public void buildComputer() {
        Computer c = new Computer.ComputerBuider("200GB","4GB").setBluetoothEnable(false).setUsbSupport(true).build();
        Assert.assertTrue(c.isUsbSupport());
        System.out.println(c);
    }

}