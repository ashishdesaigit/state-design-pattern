package com.ashishd.pattern.behavioural.state;

public class VibrationAlertState implements MobileAlertState {
    @Override
    public void alert() {
        System.out.println("Vibration");
    }
}
