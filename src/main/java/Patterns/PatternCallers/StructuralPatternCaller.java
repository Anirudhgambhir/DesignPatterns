package Patterns.PatternCallers;

import Patterns.StructuralPatterns.AdapterPattern.IceCreamFactory;
import Patterns.StructuralPatterns.AdapterPattern.IceCreamFactoryAdapter;
import Patterns.StructuralPatterns.BridgePattern.Device.Device;
import Patterns.StructuralPatterns.BridgePattern.Device.Speaker;
import Patterns.StructuralPatterns.BridgePattern.Device.TV;
import Patterns.StructuralPatterns.BridgePattern.Remote.AdvancedRemote;
import Patterns.StructuralPatterns.BridgePattern.Remote.BasicRemote;
import Patterns.StructuralPatterns.BridgePattern.Remote.Remote;

public class StructuralPatternCaller {

    // Adapter Pattern
    public static void adapterPatternCaller() {
        IceCreamFactoryAdapter iceCreamFactoryAdapter = new IceCreamFactoryAdapter(new IceCreamFactory());
        System.out.println(iceCreamFactoryAdapter.burn());
    }

    public static void bridgePatternCaller() {
        // TV Caller
        Device tv = new TV();
        bridgePatternhelper(tv);

        // Speaker Caller
        Speaker speaker = new Speaker();
        bridgePatternhelper(speaker);
    }

    private static void bridgePatternhelper(Device device) {
        // Basic Remote
        Remote remote = new BasicRemote(device);
        remote.turnOn();
        remote.shakeItOff();
        remote.turnOff();
        // Advanced Remote
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.turnOn();
        advancedRemote.turnOff();
        advancedRemote.shakeItOff();
        advancedRemote.check();
    }

}
