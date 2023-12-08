package Patterns.CreationalPatterns.PrototypePattern;

public class PrototypeClass implements Prototype {
    public static String checkObject(PrototypeClass prototypeClass) {
        return prototypeClass.toString();
    }

    @Override
    public Prototype copy() {
        return new PrototypeClass();
    }
}
