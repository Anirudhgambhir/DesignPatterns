package Patterns.CreationalPatterns;

import Patterns.CreationalPatterns.BuilderPattern.BuilderLombok;
import Patterns.CreationalPatterns.BuilderPattern.BuilderManual;
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
}
