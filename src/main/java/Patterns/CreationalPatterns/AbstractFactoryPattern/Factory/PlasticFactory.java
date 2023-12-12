package Patterns.CreationalPatterns.AbstractFactoryPattern.Factory;

import Patterns.CreationalPatterns.AbstractFactoryPattern.Factory.Factory;

public class PlasticFactory implements Factory {
    @Override
    public String getFactoryName() {
        return "Plastic Factory";
    }
}
