package ss8_CleanCode.service;

import ss8_CleanCode.entity.Car;
import ss8_CleanCode.entity.Motorbike;
import ss8_CleanCode.entity.Truck;

public interface AddVehicleInterface {
    void addCar(Car car);
    void addTruck(Truck truck);
    void addMotorbike(Motorbike motorbike);
}
