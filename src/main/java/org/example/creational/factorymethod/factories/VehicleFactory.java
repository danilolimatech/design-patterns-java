package org.example.creational.factorymethod.factories;

import org.example.creational.factorymethod.vehicles.Vehicle;

public interface VehicleFactory {
    Vehicle getVehicle(String vehicleName);
}
