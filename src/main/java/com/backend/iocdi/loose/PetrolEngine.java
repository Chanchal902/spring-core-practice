package com.backend.iocdi.loose;

public class PetrolEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Petrol Engine Started");
    }
}
