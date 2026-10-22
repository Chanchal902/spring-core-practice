package com.backend.iocdi.loose;

public class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void drive() {
        System.out.println("Car is driving");
        engine.start();
    }
}
