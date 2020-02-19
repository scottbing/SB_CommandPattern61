package com.company;

public class TurnDeviceUp implements Command{

    ElectronicDevice theDevice;
    public TurnDeviceUp(ElectronicDevice newDevice) {
        theDevice = newDevice;
    }

    @Override
    public void execute() {
        theDevice.off();
    }

    @Override
    public void undo() {
        theDevice.off();
    }
}
