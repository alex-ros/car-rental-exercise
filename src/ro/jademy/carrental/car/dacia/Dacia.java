package ro.jademy.carrental.car.dacia;

import ro.jademy.carrental.car.Car;

public abstract class Dacia extends Car {

    public Dacia(String model, Integer year, String carType, String fuelType, Integer doorNumber, String color, String transmissionType, String engine, Integer basePrice) {
        super("Dacia", model, year, carType, fuelType, doorNumber, color, transmissionType, engine, basePrice);
    }
}
