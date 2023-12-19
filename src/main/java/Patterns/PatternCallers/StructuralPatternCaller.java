package Patterns.PatternCallers;

import Patterns.StructuralPatterns.AdapterPattern.IceCreamFactory;
import Patterns.StructuralPatterns.AdapterPattern.IceCreamFactoryAdapter;
import Patterns.StructuralPatterns.BridgePattern.Device.Device;
import Patterns.StructuralPatterns.BridgePattern.Device.Speaker;
import Patterns.StructuralPatterns.BridgePattern.Device.TV;
import Patterns.StructuralPatterns.BridgePattern.Remote.AdvancedRemote;
import Patterns.StructuralPatterns.BridgePattern.Remote.BasicRemote;
import Patterns.StructuralPatterns.BridgePattern.Remote.Remote;
import Patterns.StructuralPatterns.CompositePattern.CompanyDirectory;
import Patterns.StructuralPatterns.CompositePattern.Developer;
import Patterns.StructuralPatterns.CompositePattern.Manager;
import Patterns.StructuralPatterns.DecoratorPattern.Industry;
import Patterns.StructuralPatterns.DecoratorPattern.LargeFactory;
import Patterns.StructuralPatterns.DecoratorPattern.SmallFactory;

public class StructuralPatternCaller {

    // Adapter Pattern
    public static void adapterPatternCaller() {
        IceCreamFactoryAdapter iceCreamFactoryAdapter = new IceCreamFactoryAdapter(new IceCreamFactory());
        System.out.println(iceCreamFactoryAdapter.burn());
    }

    // Bridge Pattern Caller
    public static void bridgePatternCaller() {
        // TV Caller
        Device tv = new TV();
        bridgePatternHelper(tv);

        // Speaker Caller
        Speaker speaker = new Speaker();
        bridgePatternHelper(speaker);
    }

    // Composite Pattern Caller
    public static void compositePatternCaller() {
        Developer dev1 = new Developer("Lokesh Sharma",1001, 1234);
        Developer dev2 = new Developer("Lokesh Sharma",1002, 1234);
        CompanyDirectory engDirectory = new CompanyDirectory();
        engDirectory.addEmployee(dev1);
        engDirectory.addEmployee(dev2);

        Manager man1 = new Manager("Lokesh Sharma Manager",1003,1234);
        Manager man2 = new Manager("Lokesh Sharma Manager2",1004, 1234);

        CompanyDirectory accDirectory = new CompanyDirectory();
        accDirectory.addEmployee(man1);
        accDirectory.addEmployee(man2);

        CompanyDirectory directory = new CompanyDirectory();
        directory.addEmployee(engDirectory);
        directory.addEmployee(accDirectory);
        directory.getEmployeeDetails();
    }

    // Decorator Pattern Caller
    public static void decoratorPatternCaller() {
        Industry small = new SmallFactory();
        System.out.println("SMALL COST : " + small.getCost());
        System.out.println("SMALL CAPACITY : " + small.getCapacity());
        System.out.println("SMALL EMPLOYEE : " + small.employeeCapacity());

        Industry large = new LargeFactory(small);
        System.out.println("LARGE COST : " + large.getCost());
        System.out.println("LARGE CAPACITY : " + large.getCapacity());
        System.out.println("LARGE EMPLOYEE : " + large.employeeCapacity());
    }

    private static void bridgePatternHelper(Device device) {
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
