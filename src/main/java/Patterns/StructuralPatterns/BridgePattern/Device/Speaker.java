package Patterns.StructuralPatterns.BridgePattern.Device;

public class Speaker implements Device{
    @Override
    public void enable() {
        System.out.println("Speaker is turned on");
    }

    @Override
    public void disable() {
        System.out.println("Speaker is turned off");
    }

    @Override
    public void isWorking() {
        System.out.println("Speaker is facing sound issues. !!NOT WORKING!!");
    }
}
