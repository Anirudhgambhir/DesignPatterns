package Patterns.StructuralPatterns.FacadePattern.LogicClasses;

public class AirConditioner {

    private static int TEMP = 25;
    public void decreaseTemp() {
        System.out.println("temp is now reduced to " + (--TEMP));
    }

    public void increaseTemp() {
        System.out.println("temp is now reduced to " + (++TEMP));
    }
}
