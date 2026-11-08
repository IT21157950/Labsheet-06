public class Vehicle {

    protected String vehicleName;

    // Default constructor
    public Vehicle() {
        vehicleName = "Unknown Vehicle";
    }

    // Parameterized constructor
    public Vehicle(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    // Display vehicle name
    public void displayVehicleDetails() {
        System.out.println("Vehicle Name: " + vehicleName);
    }

    // Default speed
    public double calculateSpeed() {
        return 0.0;
    }

    // Overloaded method
    public double calculateSpeed(double factor) {
        return calculateSpeed() * factor;
    }
}