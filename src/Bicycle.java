public class Bicycle extends Vehicle {

    private int gearCount;
    private double maxPedalSpeed;

    // Default constructor
    public Bicycle() {
        super();

        gearCount = 0;
        maxPedalSpeed = 0.0;
    }

    // Parameterized constructor
    public Bicycle(String vehicleName,
                   int gearCount,
                   double maxPedalSpeed) {

        super(vehicleName);

        this.gearCount = gearCount;
        this.maxPedalSpeed = maxPedalSpeed;
    }

    // Override speed calculation
    @Override
    public double calculateSpeed() {
        return maxPedalSpeed;
    }

    // Override display method
    @Override
    public void displayVehicleDetails() {

        super.displayVehicleDetails();

        System.out.println(
                "Gear Count: "
                        + gearCount
        );

        System.out.println(
                "Maximum Pedaling Speed: "
                        + calculateSpeed()
                        + " km/h"
        );
    }
}