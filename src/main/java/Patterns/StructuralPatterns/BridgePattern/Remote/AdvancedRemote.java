package Patterns.StructuralPatterns.BridgePattern.Remote;

import Patterns.StructuralPatterns.BridgePattern.Device.Device;

public class AdvancedRemote extends BasicRemote{
    public AdvancedRemote(Device device) {
        super(device);
    }

    public void check() {
        System.out.println("CHECKING DEVICE AND REMOTE");
        device.isWorking();
        shakeItOff();
    }
}
