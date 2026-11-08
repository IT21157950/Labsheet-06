public class VehicleApp {

    public static void main(String[] args) {

        // Car using default constructor
        Car car = new Car();

        System.out.println(
                "=== Car ==="
        );

        car.displayVehicleDetails();

        System.out.println(
                "Normal Speed: "
                        + car.calculateSpeed()
        );

        System.out.println(
                "Scaled Speed (Factor 2): "
                        + car.calculateSpeed(2)
        );


        System.out.println();


        // Bicycle using parameterized constructor
        Bicycle bicycle =
                new Bicycle(
                        "Mountain Bike",
                        21,
                        35.0
                );

        System.out.println(
                "=== Bicycle ==="
        );

        bicycle.displayVehicleDetails();

        System.out.println(
                "Normal Speed: "
                        + bicycle.calculateSpeed()
        );

        System.out.println(
                "Scaled Speed (Factor 2): "
                        + bicycle.calculateSpeed(2)
        );
    }
}