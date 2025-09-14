public class Vehicle1 {
    static double registrationFee = 1000.0;

    final String registrationNumber;
    String ownerName;
    String vehicleType;

    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    void displayVehicleDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: $" + registrationFee);
        }
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("John", "Car", "REG123");
        Vehicle v2 = new Vehicle("Alice", "Motorbike", "REG456");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        Vehicle.updateRegistrationFee(1200.0);
        System.out.println("\nAfter fee update:");
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
