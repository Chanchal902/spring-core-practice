package com.backend.iocdi.loose;

public class Main {
    public static void main(String[] args) {
        Engine engine = new PetrolEngine();
        Car car = new Car(engine);
        car.drive();

        Car2 car2 = new Car2();
        car2.setEngine(engine);
        car2.drive();
    }
}
