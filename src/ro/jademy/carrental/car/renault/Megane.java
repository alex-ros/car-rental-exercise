package ro.jademy.carrental.car.renault;

public class Megane extends Renault{
    public Megane(Integer year, String carType, String fuelType, String color, String transmissionType, String engine, Integer basePrice) {
        super("Megane", year, carType, fuelType, 4, color, transmissionType, engine, basePrice);
    }
}
