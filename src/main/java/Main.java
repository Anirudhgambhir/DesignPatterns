import Patterns.PatternCallers.CreationalPatternCaller;
import Patterns.PatternCallers.StructuralPatternCaller;

public class Main {
    public static void main(String[] args) {

        // Creation Pattern Callers
        creationalPatternCallers();

        // Structural Pattern Callers
        structuralPatternCallers();
    }

    private static void structuralPatternCallers() {
        // Adapter Pattern
        StructuralPatternCaller.adapterPatternCaller();

        // Bridge Pattern
        StructuralPatternCaller.bridgePatternCaller();

        // Composite Pattern
        StructuralPatternCaller.compositePatternCaller();

        // Decorator Pattern
        StructuralPatternCaller.decoratorPatternCaller();
    }

    private static void creationalPatternCallers() {
        // Builder Pattern - Manual
        CreationalPatternCaller.builderManual();

        // Builder Pattern using Lombok
        CreationalPatternCaller.builderLombok();

        // Singleton pattern - Double Locking
        CreationalPatternCaller.singletonDoubleLocking();

        // Prototype Pattern
        CreationalPatternCaller.prototypePatternCaller();

        // Factory Method Pattern
        CreationalPatternCaller.factoryPatternCaller();

        // Abstract Factory Pattern
        CreationalPatternCaller.abstractFactoryPatternCaller();
    }
}
