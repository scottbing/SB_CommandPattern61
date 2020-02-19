package com.company;

public class Jacuzzi implements ElectronicDevice{

    public static final int HIGH = 3;

    @Override
    public void on() {

    }

    @Override
    public void volumeUp() {

    }

    @Override
    public void volumeDown() {

    }

    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String location;
    int speed;

    @Override
    public void off() {
        speed = OFF;
    }

    @Override
    public void high() {
        speed = HIGH;
    }

    @Override
    public void medium() {
        speed = MEDIUM;
    }

    @Override
    public void low() {
        speed = LOW;
    }

    @Override
    public int getSpeed() {
        return speed;
    }
}
