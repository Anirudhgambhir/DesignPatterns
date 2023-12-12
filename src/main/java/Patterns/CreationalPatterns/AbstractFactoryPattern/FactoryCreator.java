package Patterns.CreationalPatterns.AbstractFactoryPattern;

import Patterns.CreationalPatterns.AbstractFactoryPattern.AbstractFactory.AbstractFactory;
import Patterns.CreationalPatterns.AbstractFactoryPattern.AbstractFactory.FactoryFactory;
import Patterns.CreationalPatterns.AbstractFactoryPattern.AbstractFactory.MaterialFactory;

public class FactoryCreator {
    public static AbstractFactory getFactory(String name) {
        return name.equalsIgnoreCase("FACTORY") ? new FactoryFactory() : new MaterialFactory();
    }
}
