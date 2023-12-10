package Patterns.CreationalPatterns.FactoryMethodPattern.Factory;

public class SteelFactory implements Factory {

    @Override
    public String getObject(String factory) {
        return factory + " produced " + getClass().getSimpleName();
    }
}
