package Patterns.StructuralPatterns.AdapterPattern;

public class IceCreamFactoryAdapter implements Industry{

    private final IceCreamFactory iceCreamFactory;

    public IceCreamFactoryAdapter(IceCreamFactory iceCreamFactory) {
        this.iceCreamFactory = iceCreamFactory;
    }

    @Override
    public String burn() {
        return iceCreamFactory.makeIceCream();
    }
}
