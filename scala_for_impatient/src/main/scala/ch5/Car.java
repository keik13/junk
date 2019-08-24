package ch5;

public class Car {
    private final String brand;
    private final String model;
    private final Integer year;
    private String number;

    public Car(String brand, String model, Integer year, String number) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.number = number;
    }

    public Car(String brand, String model, String number) {
        this(brand, model, -1, number);
    }

    public Car(String brand, String model, Integer year) {
        this(brand, model, year, " ");
    }

    public Car(String brand, String model) {
        this(brand, model, -1, " ");
    }
}
