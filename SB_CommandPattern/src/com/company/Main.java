package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ElectronicDevice sonyTV = DeviceFactory.getDevice(DeviceFactory.DeviceEnum.TV);
        ElectronicDevice geFan = DeviceFactory.getDevice(DeviceFactory.DeviceEnum.FAN);
        ElectronicDevice spa = DeviceFactory.getDevice(DeviceFactory.DeviceEnum.JACUZZI);

        JacuzziMediumCommand JacuzziMedium =
                new JacuzziMediumCommand(spa);
        JacuzziHighCommand JacuzziHigh =
                new JacuzziHighCommand(Jacuzzi);
        JacuzziOffCommand JacuzziOff =
                new JacuzziOffCommand(Jacuzzi);

        int numOfEnums = DeviceFactory.DeviceEnum.values().length;
        RemoteControl remote = new RemoteControl((numOfEnums));

        TurnDeviceOn onCommand = new TurnDeviceOn(sonyTV);
        TurnDeviceOff offCommand = new TurnDeviceOff(sonyTV);
        remote.setCommand(0, onCommand, offCommand);
        remote.pressonButton(0);
        remote.pressoffButton(0);

        TurnDeviceOn onHighCommand = new TurnDeviceOn(spa);
        TurnDeviceOff offHighCommand = new TurnDeviceOff(spa);
        remote.setCommand(0, onCommand, offCommand);

        remote.setCommand(0, JacuzziMedium, JacuzziOff);
        remote.setCommand(1, JacuzziHigh, JacuzziOff);

        remote.pressonButton(1);
        remote.pressoffButton(1);


        JacuzziHighCommand JacuzziHigh = new JacuzziHighCommand(spa);

        JacuzziMediumCommand JacuzziMedium =
                new JacuzziMediumCommand(Jacuzzi);
        JacuzziHighCommand JacuzziHigh =
                new JacuzziHighCommand(Jacuzzi);
        JacuzziOffCommand JacuzziOff =
                new JacuzziOffCommand(Jacuzzi);
        remote.setCommand(0, JacuzziMedium, JacuzziOff);
        remote.setCommand(1, JacuzziHigh, JacuzziOff);
        remote.onButtonWasPushed(0); remote.offButtonWasPushed(0); System.out.println(remote); remote.undoButtonWasPushed();
        remote.onButtonWasPushed(1); System.out.println(remote); remote.undoButtonWasPushed();



    }
}
