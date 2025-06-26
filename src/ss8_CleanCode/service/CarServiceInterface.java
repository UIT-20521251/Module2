package ss8_CleanCode.service;

import ss8_CleanCode.entity.Car;

import java.util.List;

public interface CarServiceInterface {
    void addCar(Car car);
    List<Car> showAllCars();
    boolean removeCar(Car car);
    Car findCarByPlate(String plate);

}
