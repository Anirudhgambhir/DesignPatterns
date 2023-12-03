package Patterns.CreationalPatterns.SingletonPattern;

public class SingletonClass {
    // This class implements Singleton patterns using double - checked locking

    private static volatile SingletonClass singletonClassObject;

    private SingletonClass() {}

    public static SingletonClass getSingletonClassObject() {
        if (singletonClassObject == null) {
            synchronized (SingletonClass.class) {
                if (singletonClassObject == null) {
                    singletonClassObject = new SingletonClass();
                }
            }
        }
        return singletonClassObject;
    }

    // can have other methods for business Logic or other functionality
    public String getSomething() {
        return "SINGLETON CLASS getSomething method";
    }

    public static String checkObject(SingletonClass singletonClass) {
        return singletonClass.toString();
    }
}
