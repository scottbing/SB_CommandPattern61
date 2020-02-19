package com.company;

public class Jacuzzi implements WaterFeature{

    @Override
    public void on() {
        System.out.println("Jacuzzi is on");
    }

    @Override
    public void off() {
        System.out.println("Jacuzzi is off");
    }

    @Override
    public void jetsOn() {
        System.out.println("Jets are on");
    }

    @Override
    public void jetsOff() {
        System.out.println("Jets are off");
    }

    @Override
    public void circulate() {
        System.out.println("Water is circulating");
    }

    @Override
    public void setTemperature() {
        System.out.println("Temperature is set");
    }

}
