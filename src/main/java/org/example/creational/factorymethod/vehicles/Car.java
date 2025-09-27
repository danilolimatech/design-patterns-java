package org.example.creational.factorymethod.vehicles;

public class Car implements Vehicle {

    private final String name;

    public Car (String name) {
        this.name = name;
    }

    @Override
    public void pickUp(String customerName) {
        System.out.println(name + " is picking up " + customerName);
    }
}
