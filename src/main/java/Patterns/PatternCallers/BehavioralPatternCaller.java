package Patterns.PatternCallers;

import Patterns.behavioralpatterns.strategypattern.DBDaoLayer;
import Patterns.behavioralpatterns.strategypattern.DoSomething;
import Patterns.behavioralpatterns.strategypattern.S3DaoLayer;
import lombok.experimental.UtilityClass;

@UtilityClass
public class BehavioralPatternCaller {
    public void strategyPatternCaller() {
        // DB Based approach
        DoSomething doSomething = new DoSomething(new DBDaoLayer());
        doSomething.work();

        //S3 Based Approach
        doSomething = new DoSomething(new S3DaoLayer());
        doSomething.work();
    }
}
