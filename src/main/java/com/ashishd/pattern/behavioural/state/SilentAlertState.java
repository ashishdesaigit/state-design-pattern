package com.ashishd.pattern.behavioural.state;

public class SilentAlertState implements MobileAlertState {
    @Override
    public void alert() {
        System.out.println("Silent");
    }
}
