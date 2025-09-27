package org.example.creational.factorymethod.vehicles;

public class Motorcycle implements Vehicle {

    private final String name;

    public Motorcycle(String name) {
        this.name = name;
    }

    @Override
    public void pickUp(String costumerName) {
        System.out.println(name + " is picking up " + costumerName);
    }
}
