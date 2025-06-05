package ss8_CleanCode.service;

import ss8_CleanCode.entity.Car;
import ss8_CleanCode.entity.Motorbike;
import ss8_CleanCode.entity.Truck;
import ss8_CleanCode.repository.CarRepository;
import ss8_CleanCode.repository.MotorbikeRepository;
import ss8_CleanCode.repository.TruckRepository;

import java.util.List;

public class CarService implements CarInterface {
    private CarRepository carRepository = new CarRepository();
    @Override
    public void addCar(Car car) {
        carRepository.add(car);
    }
    @Override
    public List<Car> showAllCars() {
        return carRepository.getCars();
    }



}
