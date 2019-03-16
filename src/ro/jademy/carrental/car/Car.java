package ro.jademy.carrental.car;

import java.util.Objects;

public abstract class Car {

    private boolean rented;
    // Q: how can we better represent the car make?
    private String make;
    private String model;
    private Integer year;

    // Q: how can we better represent the car type?
    private String carType; // coupe, sedan, hatchback, convertible, wagon, SUV ---ENUM---

    // Q: how can we better represent the motor type?
    private String fuelType; // diesel, gasoline, alternative ---ENUM---

    private Integer doorNumber;

    private String color;

    // Q: how can we better represent the transmission type?
    private String transmissionType; // automatic, manual ---ENUM---

    // Q: how can we better represent the engine?
    private String engine;
    // Q: how can we better represent money value?
    private Integer basePrice;

    // Q: do we need a constructor other than the default one?
    // Q: how can we better protect the car data?


    public Car(boolean rented) {
        this.rented = rented;
    }

    public Car(String make, String model, Integer year, String carType, String fuelType, Integer doorNumber, String color, String transmissionType, String engine, Integer basePrice) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.carType = carType;
        this.fuelType = fuelType;
        this.doorNumber = doorNumber;
        this.color = color;
        this.transmissionType = transmissionType;
        this.engine = engine;
        this.basePrice = basePrice;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public Integer getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(Integer doorNumber) {
        this.doorNumber = doorNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public Integer getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(Integer basePrice) {
        this.basePrice = basePrice;
    }

    public boolean isRented() {
        return rented;
    }

    public void setRented(boolean rented) {
        this.rented = rented;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return rented == car.rented &&
                Objects.equals(make, car.make) &&
                Objects.equals(model, car.model) &&
                Objects.equals(year, car.year) &&
                Objects.equals(carType, car.carType) &&
                Objects.equals(fuelType, car.fuelType) &&
                Objects.equals(doorNumber, car.doorNumber) &&
                Objects.equals(color, car.color) &&
                Objects.equals(transmissionType, car.transmissionType) &&
                Objects.equals(engine, car.engine) &&
                Objects.equals(basePrice, car.basePrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rented, make, model, year, carType, fuelType, doorNumber, color, transmissionType, engine, basePrice);
    }

    @Override
    public String toString() {
        return "(" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", carType='" + carType + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", doorNumber=" + doorNumber +
                ", color='" + color + '\'' +
                ", transmissionType='" + transmissionType + '\'' +
                ", engine='" + engine + '\'' +
                ", basePrice='" + basePrice + '\'' +
                ')';
    }


}
