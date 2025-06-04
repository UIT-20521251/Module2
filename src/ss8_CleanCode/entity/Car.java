package ss8_CleanCode.entity;

public class Car extends Vehicle {
    private int numberOfSeats;  // Số chỗ ngồi
    private String carType;     // Kiểu xe (du lịch, xe khách)

    public Car(String licensePlate, String manufacturerName, int yearOfManufacture, String owner,
               int numberOfSeats, String carType) {
        super(licensePlate, manufacturerName, yearOfManufacture, owner);
        this.numberOfSeats = numberOfSeats;
        this.carType = carType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getCarType() {
        return carType;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    @Override
    public String toString() {
        return licensePlate+", "+brandName+", "+productionYear+", "+owner+", "+numberOfSeats+", "+carType;
    }
}
