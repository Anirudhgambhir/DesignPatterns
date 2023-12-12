package Patterns.CreationalPatterns.AbstractFactoryPattern.Factory;

import Patterns.CreationalPatterns.AbstractFactoryPattern.Factory.Factory;

public class SteelFactory implements Factory {
    @Override
    public String getFactoryName() {
        return "Steel Factory";
    }
}
