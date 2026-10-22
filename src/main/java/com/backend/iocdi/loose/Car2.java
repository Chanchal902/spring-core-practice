package com.backend.iocdi.loose;

public class Car2 {
    private Engine engine;

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void drive() {
        System.out.println("Car2 is driving");
        engine.start();
    }
}
