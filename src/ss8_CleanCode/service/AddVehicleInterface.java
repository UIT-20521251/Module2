package ss8_CleanCode.service;

import ss8_CleanCode.entity.Car;
import ss8_CleanCode.entity.Motorbike;
import ss8_CleanCode.entity.Truck;

public interface AddVehicleInterface {
    void addCar(String licensePlate, String brandName, int productionYear, String owner,
                int numberOfSeats, String carType);
    void addTruck(String licensePlate, String brandName, int productionYear, String owner,
                  int loadCapacity);
    void addMotorbike(String licensePlate, String brandName, int productionYear, String owner,
                     int horsepower);
}
