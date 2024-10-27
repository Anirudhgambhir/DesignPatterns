package Patterns.behavioralpatterns.strategypattern;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class DoSomething {

    private final DAOLayer daoLayer;
    public void work() {
        daoLayer.save("John");
        daoLayer.delete("John");
        daoLayer.update("John");
        daoLayer.get("John");
        daoLayer.getAll();
    }
}
