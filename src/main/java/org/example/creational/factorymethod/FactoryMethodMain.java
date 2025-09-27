package org.example.creational.factorymethod;

import org.example.creational.factorymethod.factories.CarFactory;
import org.example.creational.factorymethod.factories.MotorcycleFactory;
import org.example.creational.factorymethod.vehicles.Vehicle;

public class FactoryMethodMain {

    // Factory Method é um padrão de criação que define uma interface para criar
    // objetos, mas deixa as subclasses decidirem qual classe concreta instanciar.
    // Ou seja, o código cliente não precisa conhecer a classe exata que está
    // sendo criada.

    // Imagine uma cafeteria: você pede “um café” (interface), mas a cafeteria
    // decide se vai te entregar um expresso, cappuccino ou latte (classe concreta).
    // Você só chama o método prepareCoffee(), sem se preocupar com a implementação
    // interna.

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
