package Patterns.StructuralPatterns.CompositePattern;

import lombok.ToString;

@ToString
public class Developer implements Employee{

    private final String name;
    private final int id;
    private final long salary;

    public Developer(String name, int id, long salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    @Override
    public void getEmployeeDetails() {
        System.out.println(this);
    }
}
