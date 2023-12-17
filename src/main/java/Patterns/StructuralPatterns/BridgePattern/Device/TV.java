package Patterns.StructuralPatterns.BridgePattern.Device;

public class TV implements Device {
    @Override
    public void enable() {
        System.out.println("TV is enabled now");
    }

    @Override
    public void disable() {
        System.out.println("TV is turned off now!");
    }

    @Override
    public void isWorking() {
        System.out.println("TV is Working");
    }
}
