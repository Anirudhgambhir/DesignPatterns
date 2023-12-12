package Patterns.CreationalPatterns.AbstractFactoryPattern.Material;

import Patterns.CreationalPatterns.AbstractFactoryPattern.Material.Material;

public class SteelMaterial implements Material {
    @Override
    public String createMaterial(String rawMaterial) {
        return "Steel is formed using " + rawMaterial;
    }
}
