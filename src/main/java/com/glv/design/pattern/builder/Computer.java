package com.glv.design.pattern.builder;

/**
 * Created by Apple on 18/3/24.
 */
public class Computer {
    private String hardDiskSize;
    private String ramSize;
    private boolean isUsbSupport;
    private boolean isBluetoothEnable;


    private Computer(ComputerBuider builder) {
        this.hardDiskSize = builder.hardDiskSize;
        this.ramSize = builder.ramSize;
        this.isUsbSupport = builder.isUsbSupport;
        this.isBluetoothEnable = builder.isBluetoothEnable;
    }

    public static class ComputerBuider {

        private String hardDiskSize;
        private String ramSize;
        private boolean isUsbSupport;
        private boolean isBluetoothEnable;

        public ComputerBuider(String hardDiskSize, String ramSize) {
            this.hardDiskSize = hardDiskSize;
            this.ramSize = ramSize;
        }

        public ComputerBuider setUsbSupport(boolean usbSupport) {
            this.isUsbSupport = usbSupport;
            return this;
        }

        public ComputerBuider setBluetoothEnable(boolean bluetoothEnable) {
            this.isBluetoothEnable = bluetoothEnable;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    public String getHardDiskSize() {
        return hardDiskSize;
    }

    public String getRamSize() {
        return ramSize;
    }

    public boolean isUsbSupport() {
        return isUsbSupport;
    }

    public boolean isBluetoothEnable() {
        return isBluetoothEnable;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "hardDiskSize='" + hardDiskSize + '\'' +
                ", ramSize='" + ramSize + '\'' +
                ", isUsbSupport=" + isUsbSupport +
                ", isBluetoothEnable=" + isBluetoothEnable +
                '}';
    }
}
