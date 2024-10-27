package Patterns.behavioralpatterns.strategypattern;

public interface DAOLayer {
    public void save(String name);
    public void delete(String name);
    public void update(String name);
    public void get(String name);
    public void getAll();
}
