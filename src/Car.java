public class Car extends Vehicle {

    private int engineCapacity;
    private double topSpeed;

    // Default constructor
    public Car() {
        super();

        engineCapacity = 0;
        topSpeed = 0.0;
    }

    // Parameterized constructor
    public Car(String vehicleName,
               int engineCapacity,
               double topSpeed) {

        super(vehicleName);

        this.engineCapacity = engineCapacity;
        this.topSpeed = topSpeed;
    }

    // Override speed calculation
    @Override
    public double calculateSpeed() {
        return topSpeed;
    }

    // Override display method
    @Override
    public void displayVehicleDetails() {

        super.displayVehicleDetails();

        System.out.println(
                "Engine Capacity: "
                        + engineCapacity
                        + " CC"
        );

        System.out.println(
                "Top Speed: "
                        + calculateSpeed()
                        + " km/h"
        );
    }
}