import Patterns.CreationalPatterns.BuilderPattern.BuilderLombok;
import Patterns.CreationalPatterns.BuilderPattern.BuilderManual;

public class Main {
    public static void main(String[] args) {

        // Builder Pattern - Manual
        builderManual();

        // Builder Pattern using Lombok
        builderLombok();

    }

    private static void builderManual() {
        BuilderManual builder = BuilderManual.builder()
                .withId(1234).withName("JOHN DOE").withCompany("TEST").withSalary(123456).build();
        System.out.println(builder);

    }

    private static void builderLombok() {
        BuilderLombok builder = BuilderLombok.builder()
                .id(1234).name("JOHN DOE AGAIN").company("TEST AGAIN").salary(1234455).build();
        System.out.println(builder);

    }
}
