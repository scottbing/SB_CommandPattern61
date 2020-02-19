package com.company;

public class TurnDeviceDown implements Command {

    ElectronicDevice theDevice;
    public TurnDeviceDown(ElectronicDevice newDevice) {
        theDevice = newDevice;
    }

    @Override
    public void execute() {
        theDevice.off();
    }

    @Override
    public void undo() {
        theDevice.on();
    }
}
