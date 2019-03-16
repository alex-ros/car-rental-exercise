package ro.jademy.carrental.car.renault;

import ro.jademy.carrental.car.Car;

public abstract class Renault extends Car {

    public Renault(String model, Integer year, String carType, String fuelType, Integer doorNumber, String color, String transmissionType, String engine, Integer basePrice) {
        super("Renault", model, year, carType, fuelType, doorNumber, color, transmissionType, engine, basePrice);
    }
}
