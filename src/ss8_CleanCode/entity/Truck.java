package ss8_CleanCode.entity;

public class Truck extends Vehicle {
    private int loadCapacity;

    public Truck(String licensePlate, String manufacturerName, int productionYear, String owner,
                 int loadCapacity) {
        super(licensePlate, manufacturerName, productionYear, owner);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}
