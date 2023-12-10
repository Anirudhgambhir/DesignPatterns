package Patterns.CreationalPatterns.FactoryMethodPattern.Factory;

import Patterns.CreationalPatterns.FactoryMethodPattern.Factory.Factory;

public class PlasticFactory implements Factory {

    @Override
    public String getObject(String factory) {
        return factory + " produced " + getClass().getSimpleName();
    }
}
