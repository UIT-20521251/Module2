package ss8_CleanCode.controller.VehicleController;

import ss8_CleanCode.entity.Car;
import ss8_CleanCode.service.CarServiceInterface;
import ss8_CleanCode.service.CarService;

import java.util.List;

public class CarController {
    private CarServiceInterface carService = new CarService();

    public void add(Car car){
        carService.addCar(car);
    }
    public List<Car> showAllCars(){
        return carService.showAllCars();
    }
    public boolean remove(String plate){
        return carService.removeCar(findCarByPlate(plate));

    }
    public Car findCarByPlate(String plate){
        return carService.findCarByPlate(plate);
    }
}
