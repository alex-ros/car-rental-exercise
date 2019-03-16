package ro.jademy.carrental.car.renault;

public class Clio extends Renault {

    public Clio(Integer year, String fuelType, String color, String transmissionType, String engine, Integer basePrice) {
        super("Clio", year, "hatchback", fuelType, 4, color, transmissionType, engine, basePrice);
    }
}
