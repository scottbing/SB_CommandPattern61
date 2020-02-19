package com.company;

public class WaterFeatureFactory {
    enum WaterFeatureEnum {

        JACUZZI {
            public WaterFeature returnClass() { return new Jacuzzi(); }
        };

        public abstract ElectronicDevice returnClass();

    }

    public static WaterFeature  getDevice(DeviceFactory.DeviceEnum deviceEnum) {
        return WaterFeatureEnum.returnClass();
    }
}
