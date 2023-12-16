package Patterns.PatternCallers;

import Patterns.StructuralPatterns.AdapterPattern.IceCreamFactory;
import Patterns.StructuralPatterns.AdapterPattern.IceCreamFactoryAdapter;

public class StructuralPatternCaller {

    // Adapter Pattern
    public static void adapterPatternCaller() {
        IceCreamFactoryAdapter iceCreamFactoryAdapter = new IceCreamFactoryAdapter(new IceCreamFactory());
        System.out.println(iceCreamFactoryAdapter.burn());
    }

}
