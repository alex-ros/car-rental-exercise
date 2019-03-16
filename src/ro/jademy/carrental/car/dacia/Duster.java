package ro.jademy.carrental.car.dacia;

public class Duster extends Dacia {
    public Duster(Integer year, String fuelType, String color, String transmissionType,  String engine, Integer basePrice) {
        super("Duster", year, "hatchback", fuelType, 4, color, transmissionType, engine, basePrice);
    }
}
