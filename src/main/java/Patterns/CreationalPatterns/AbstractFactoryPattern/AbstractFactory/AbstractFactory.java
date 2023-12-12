package Patterns.CreationalPatterns.AbstractFactoryPattern.AbstractFactory;

import Patterns.CreationalPatterns.AbstractFactoryPattern.Factory.Factory;
import Patterns.CreationalPatterns.AbstractFactoryPattern.Material.Material;

public interface AbstractFactory {
     Factory getFactory(String factory);
     Material getMaterial(String material);
}
