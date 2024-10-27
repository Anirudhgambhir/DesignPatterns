package Patterns.behavioralpatterns.strategypattern;

public class S3DaoLayer implements DAOLayer{
    @Override
    public void save(String name) {
        System.out.println("Saved Name in S3 - " + name);
    }

    @Override
    public void delete(String name) {
        System.out.println("deleted name from S3 - " + name);
    }

    @Override
    public void update(String name) {
        System.out.println("Updated the entry in S3 - " + name);
    }

    @Override
    public void get(String name) {
        System.out.println("Found the name - " + name);
    }

    @Override
    public void getAll() {
        System.out.println("Found everything in S3");
    }
}
