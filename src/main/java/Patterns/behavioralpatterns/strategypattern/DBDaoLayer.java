package Patterns.behavioralpatterns.strategypattern;

public class DBDaoLayer implements DAOLayer{

    @Override
    public void save(String name) {
        System.out.println("Saved Name in DB - " + name);
    }

    @Override
    public void delete(String name) {
        System.out.println("deleted name from DB - " + name);
    }

    @Override
    public void update(String name) {
        System.out.println("Updated the entry in DB - " + name);
    }

    @Override
    public void get(String name) {
        System.out.println("Found the name - " + name);
    }

    @Override
    public void getAll() {
        System.out.println("Found everything in DB");
    }
}
