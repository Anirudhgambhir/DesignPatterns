package Patterns.CreationalPatterns.AbstractFactoryPattern.AbstractFactory;

import Patterns.CreationalPatterns.AbstractFactoryPattern.Factory.Factory;
import Patterns.CreationalPatterns.AbstractFactoryPattern.Factory.PlasticFactory;
import Patterns.CreationalPatterns.AbstractFactoryPattern.Factory.SteelFactory;
import Patterns.CreationalPatterns.AbstractFactoryPattern.Material.Material;

public class FactoryFactory implements AbstractFactory{
    @Override
    public Factory getFactory(String factory) {
        return factory == null ? null :
                factory.equalsIgnoreCase("STEEL") ? new SteelFactory() : new PlasticFactory();
    }

    @Override
    public Material getMaterial(String material) {
        return null;
    }
}
