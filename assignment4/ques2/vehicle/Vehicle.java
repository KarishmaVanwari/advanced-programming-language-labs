package vehicle;

public class Vehicle {

    private String model, fuelType;
    private int wheels;

    protected Vehicle(String model, String fuelType, int wheels) {
        this.model = model;
        this.fuelType = fuelType;
        this.wheels = wheels;
    }

    protected void describe() {
        System.out.println("------------Vehicle------------");
        System.out.println("Model: " + model);
        System.out.println("Fuel: " + fuelType);
        System.out.println("Wheels: " + wheels);
    }
}
