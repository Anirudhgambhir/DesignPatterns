package Patterns.CreationalPatterns.AbstractFactoryPattern.AbstractFactory;

import Patterns.CreationalPatterns.AbstractFactoryPattern.Factory.Factory;
import Patterns.CreationalPatterns.AbstractFactoryPattern.Material.Material;
import Patterns.CreationalPatterns.AbstractFactoryPattern.Material.PlasticMaterial;
import Patterns.CreationalPatterns.AbstractFactoryPattern.Material.SteelMaterial;

public class MaterialFactory implements AbstractFactory {
    @Override
    public Factory getFactory(String factory) {
        return null;
    }

    @Override
    public Material getMaterial(String material) {
        return material == null ? null :
                material.equalsIgnoreCase("STEEL") ? new SteelMaterial() : new PlasticMaterial();
    }
}
