package com.ashishd.pattern.behavioural.state;



public class StatedesignpatternApp {

    public static void main(String args[]){

        System.out.println("Start");
        MobileStateContext context = new MobileStateContext();
        context.alert();
        context.alert();
        context.setCurrentState(new SilentAlertState());
        context.alert();
        System.out.println("End");

    }
}
