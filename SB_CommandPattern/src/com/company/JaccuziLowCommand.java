package com.company;

public class JaccuziLowCommand implements Command{

    Jacuzzi jacuzzi;
    int prevSpeed;

    public JaccuziLowCommand(Jacuzzi jacuzzi) {
        this.jacuzzi = jacuzzi;
    }

    @Override
    public void execute() {
        prevSpeed = jacuzzi.getSpeed();
        jacuzzi.low();
    }

    @Override
    public void undo() {
        if (prevSpeed == Jacuzzi.HIGH) {
            jacuzzi.high();
        } else if (prevSpeed == Jacuzzi.MEDIUM) {
            jacuzzi.medium();
        } else if (prevSpeed == Jacuzzi.LOW) {
            jacuzzi.low();
        } else if (prevSpeed == Jacuzzi.OFF) {
            jacuzzi.off(); }

    }

}
