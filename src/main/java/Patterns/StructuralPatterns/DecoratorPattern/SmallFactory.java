package Patterns.StructuralPatterns.DecoratorPattern;

public class SmallFactory implements Industry {
    @Override
    public int getCapacity() {
        return 100;
    }

    @Override
    public long getCost() {
        return 100L;
    }

    @Override
    public int employeeCapacity() {
        return 200;
    }
}
