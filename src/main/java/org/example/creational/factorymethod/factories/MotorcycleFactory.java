package org.example.creational.factorymethod.factories;

import org.example.creational.factorymethod.vehicles.Motorcycle;
import org.example.creational.factorymethod.vehicles.Vehicle;

public class MotorcycleFactory implements VehicleFactory {

    @Override
    public Vehicle getVehicle(String motorcycleName) {
        return new Motorcycle(motorcycleName);
    }
}
