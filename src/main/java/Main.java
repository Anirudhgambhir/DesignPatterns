import Patterns.CreationalPatterns.PatternCaller;

public class Main {
    public static void main(String[] args) {

        // Builder Pattern - Manual
        PatternCaller.builderManual();

        // Builder Pattern using Lombok
        PatternCaller.builderLombok();

        // Singleton pattern - Double Locking
        PatternCaller.singletonDoubleLocking();

        // Prototype Pattern
        PatternCaller.prototypePatternCaller();

        // Factory Method Patter
        PatternCaller.factoryPatternCaller();
    }
}
