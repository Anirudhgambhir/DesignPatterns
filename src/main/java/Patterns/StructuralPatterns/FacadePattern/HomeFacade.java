package Patterns.StructuralPatterns.FacadePattern;

import Patterns.StructuralPatterns.FacadePattern.LogicClasses.AirConditioner;
import Patterns.StructuralPatterns.FacadePattern.LogicClasses.MusicSystem;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class HomeFacade {
    private final MusicSystem musicSystem;
    private final AirConditioner airConditioner;

    public void eveningMode() {
        musicSystem.playMusic();
        airConditioner.decreaseTemp();
        airConditioner.decreaseTemp();
    }

    public void nightMode() {
        musicSystem.stopMusic();
        airConditioner.increaseTemp();
        airConditioner.increaseTemp();
        airConditioner.increaseTemp();
        airConditioner.increaseTemp();
    }
}
