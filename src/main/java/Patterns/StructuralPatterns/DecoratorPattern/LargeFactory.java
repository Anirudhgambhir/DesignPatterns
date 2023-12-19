package Patterns.StructuralPatterns.DecoratorPattern;

public class LargeFactory implements Industry{

    private final Industry industry;

    public LargeFactory(Industry industry) {
        this.industry = industry;
    }

    @Override
    public int getCapacity() {
        return industry.getCapacity() + 200;
    }

    @Override
    public long getCost() {
        return industry.getCost() + 500;
    }

    @Override
    public int employeeCapacity() {
        return industry.employeeCapacity() + 5000;
    }
}
