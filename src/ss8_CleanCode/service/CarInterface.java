package ss8_CleanCode.service;

import ss8_CleanCode.entity.Car;

import java.util.List;

public interface CarInterface {
    void addCar(Car car);
    List<Car> showAllCars();

}
