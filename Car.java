public class Car extends Transport implements Vehicle, Comparable<Vehicle> {
    private String modelName;
    private double fuelEfficiency;

    public Car(String modelName, double fuelEfficiency, int maxSpeed) {
        super(maxSpeed);
        this.modelName = modelName;
        this.fuelEfficiency = fuelEfficiency;
    }

    @Override
    public void start() {
        System.out.println("Vehicle Started: " + modelName);
    }

    @Override
    public void stop() {
        System.out.println("Vehicle Stopped: " + modelName);
    }

    @Override
    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    @Override
    public void displayInfo() {
        System.out.println(modelName + " - Fuel Efficiency: " + fuelEfficiency + " MPG");
    }

    @Override
    public int compareTo(Vehicle other) {
        return Double.compare(other.getFuelEfficiency(), this.fuelEfficiency);
    }
}
