package ro.jademy.carrental.car.dacia;

public class Logan extends Dacia {
    public Logan(Integer year, String fuelType, Integer doorNumber, String color, String engine, Integer basePrice) {
        super("Logan", year, "sedan", fuelType, doorNumber, color, "manual", engine, basePrice);
    }
}
