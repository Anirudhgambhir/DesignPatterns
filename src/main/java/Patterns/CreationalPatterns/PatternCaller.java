package Patterns.CreationalPatterns;

import Patterns.CreationalPatterns.BuilderPattern.BuilderLombok;
import Patterns.CreationalPatterns.BuilderPattern.BuilderManual;
import Patterns.CreationalPatterns.FactoryMethodPattern.ObjectFactory.ObjectFactory;
import Patterns.CreationalPatterns.PrototypePattern.PrototypeClass;
import Patterns.CreationalPatterns.SingletonPattern.SingletonClass;

public class PatternCaller {
    public static void builderManual() {
        BuilderManual builder = BuilderManual.builder()
                .withId(1234).withName("JOHN DOE").withCompany("TEST").withSalary(123456).build();
        System.out.println(builder);

    }

    public static void builderLombok() {
        BuilderLombok builder = BuilderLombok.builder()
                .id(1234).name("JOHN DOE AGAIN").company("TEST AGAIN").salary(1234455).build();
        System.out.println(builder);

    }

    public static void singletonDoubleLocking() {
        SingletonClass singletonClass = SingletonClass.getSingletonClassObject();
        SingletonClass singletonClass2 = SingletonClass.getSingletonClassObject();
        System.out.println(SingletonClass.checkObject(singletonClass));
        System.out.println(SingletonClass.checkObject(singletonClass2));
    }

    public static void prototypePatternCaller() {
        PrototypeClass prototypeClass = new PrototypeClass();
        PrototypeClass prototypeClass1 = (PrototypeClass) prototypeClass.copy();
        System.out.println(PrototypeClass.checkObject(prototypeClass));
        System.out.println(PrototypeClass.checkObject(prototypeClass1));
    }

    /**
     * <a href="https://java-design-patterns.com/patterns/factory-method/#applicability">Reference-1</a>
     * <a href="https://medium.com/javarevisited/factory-method-design-pattern-in-java-updated-e89f8f1a08b2#:~:text=getInstance()%20method%20of%20java,using%20the%20valueOf()%20method">Reference-2</a>.
     */
    public static void factoryPatternCaller() {
        ObjectFactory objectFactory = new ObjectFactory();

        // SteelFactory
        System.out.println(objectFactory.createFactory("STEEL_FACTORY").getObject("RAW MATERIALS SENT"));

        // PlasticFactory
        System.out.println(objectFactory.createFactory("PLASTIC_FACTORY").getObject("RAW MATERIALS SENT"));
    }
}
