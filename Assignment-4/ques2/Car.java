import vehicle.*;

public class Car extends Vehicle {
    public Car(String model, String fuelType, int wheels) {
        super(model, fuelType, 4);
    }

    public void describe() {
        System.out.println("This is a car.");
        super.describe();
    }
}
