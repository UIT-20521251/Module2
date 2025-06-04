package ss8_CleanCode.entity;

public class Motorbike extends Vehicle {
    private int horsepower; // Công suất

    public Motorbike(String licensePlate, String brandName, int productionYear, String owner,
                     int horsepower) {
        super(licensePlate, brandName, productionYear, owner);
        this.horsepower = horsepower;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }
}

