package org.example.creational.factorymethod.factories;

import org.example.creational.factorymethod.vehicles.Car;
import org.example.creational.factorymethod.vehicles.Vehicle;

public class CarFactory implements VehicleFactory {

    @Override
    public Vehicle getVehicle(String carName) {
        return new Car(carName);
    }
}
