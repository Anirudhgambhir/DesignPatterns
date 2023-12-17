package Patterns.StructuralPatterns.BridgePattern.Remote;

import Patterns.StructuralPatterns.BridgePattern.Device.Device;

public class BasicRemote implements Remote{

    protected Device device;

    public BasicRemote(Device device) {
        this.device = device;
    }

    @Override
    public void turnOn() {
        device.enable();
    }

    @Override
    public void turnOff() {
        device.disable();
    }

    @Override
    public void shakeItOff() {
        device.isWorking();
    }
}
