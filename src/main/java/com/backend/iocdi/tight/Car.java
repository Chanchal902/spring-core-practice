package com.backend.iocdi.tight;

public class Car {
    Engine engine = new Engine();

    public void drive() {
        System.out.println("Car is driving");
        engine.start();
    }
}
