public abstract class Transport {
    protected int maxSpeed;

    public Transport(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public abstract void displayInfo();
}
