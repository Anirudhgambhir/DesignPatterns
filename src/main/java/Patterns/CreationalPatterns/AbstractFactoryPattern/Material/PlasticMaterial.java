package Patterns.CreationalPatterns.AbstractFactoryPattern.Material;

import Patterns.CreationalPatterns.AbstractFactoryPattern.Material.Material;

public class PlasticMaterial implements Material {
    @Override
    public String createMaterial(String rawMaterial) {
        return "Plastic Formed using " + rawMaterial;
    }
}
