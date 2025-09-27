package org.example.creational.factorymethod;

import org.example.creational.factorymethod.factories.CarFactory;
import org.example.creational.factorymethod.factories.MotorcycleFactory;
import org.example.creational.factorymethod.vehicles.Vehicle;

public class FactoryMethod {

    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Vehicle carFusca = carFactory.getVehicle("Fusca");
        carFusca.pickUp("Danilo");

        Vehicle carSiena = carFactory.getVehicle("Siena");
        carSiena.pickUp("Daiane");

        MotorcycleFactory motorcycleFactory = new MotorcycleFactory();
        Vehicle motorcycleHonda = motorcycleFactory.getVehicle("Honda");
        motorcycleHonda.pickUp("Larissa");

        Vehicle motorcycleYamaha = motorcycleFactory.getVehicle("Yamaha");
        motorcycleYamaha.pickUp("Ricardo");
    }
}
