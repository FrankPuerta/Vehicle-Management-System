import java.util.*;

public class VehicleTest {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        
        vehicles.add(new Car("Toyota Camry", 30.0, 120));
        vehicles.add(new Motorcycle("Ducati Monster", 40.0, 160));

        for (Vehicle v : vehicles) {
            v.start();
        }

        for (Vehicle v : vehicles) {
            if (v instanceof Transport) {
                ((Transport) v).displayInfo();
            }
        }

        for (Vehicle v : vehicles) {
            v.stop();
        }

        Collections.sort(vehicles);
        
        System.out.println("\nSorted Vehicles by Fuel Efficiency:");
        for (Vehicle v : vehicles) {
            if (v instanceof Transport) {
                ((Transport) v).displayInfo();
            }
        }
    }
}
