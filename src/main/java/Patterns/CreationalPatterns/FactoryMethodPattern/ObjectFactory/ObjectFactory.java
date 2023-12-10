package Patterns.CreationalPatterns.FactoryMethodPattern.ObjectFactory;

import Patterns.CreationalPatterns.FactoryMethodPattern.Factory.Factory;
import Patterns.CreationalPatterns.FactoryMethodPattern.Factory.PlasticFactory;
import Patterns.CreationalPatterns.FactoryMethodPattern.Factory.SteelFactory;

import java.util.Locale;

public class ObjectFactory {
    private static final String STEEL_FACTORY = "STEEL_FACTORY";
    private static final String PLASTIC_FACTORY = "PLASTIC_FACTORY";

    public Factory createFactory(String type) {
        if (type == null || type.isEmpty()) {
            return null;
        } else {
            switch (type.toUpperCase(Locale.ROOT)) {
                case STEEL_FACTORY:
                    return new SteelFactory();
                case PLASTIC_FACTORY:
                    return new PlasticFactory();
                default:
                    throw new IllegalArgumentException("Unknown Factory Found");
            }
        }
    }
}
