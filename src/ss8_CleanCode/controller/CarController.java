package ss8_CleanCode.controller;

import ss8_CleanCode.entity.Car;
import ss8_CleanCode.service.TruckInterface;
import ss8_CleanCode.service.TruckService;
import ss8_CleanCode.service.CarInterface;
import ss8_CleanCode.service.CarService;

import java.util.List;

public class CarController {
    private CarInterface carService = new CarService();

    public void add(Car car){
        carService.addCar(car);
    }
    public List<Car> showAllCars(){
        return carService.showAllCars();
    }
    public void remove(String plate){
        carService.removeCar(carService.findCarByPlate(plate));
    }
}
