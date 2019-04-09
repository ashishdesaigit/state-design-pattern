package com.ashishd.pattern.behavioural.state;

public class MobileStateContext {



    MobileAlertState currentState;

    public MobileStateContext() {
        this.currentState = new VibrationAlertState();
    }

    public MobileStateContext(MobileAlertState currentState) {
        this.currentState = currentState;
    }

    public void setCurrentState(MobileAlertState currentState) {
        this.currentState = currentState;
    }


    public void alert(){
        this.currentState.alert();
    }
}
