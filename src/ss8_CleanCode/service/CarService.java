package ss8_CleanCode.service;

import ss8_CleanCode.entity.Car;
import ss8_CleanCode.repository.CarRepository;

import java.util.List;

public class CarService implements CarServiceInterface {
    private CarRepository carRepository = new CarRepository();
    @Override
    public void addCar(Car car) {
        carRepository.add(car);
    }
    @Override
    public List<Car> showAllCars() {
        return carRepository.findAllCars();
    }
    @Override
    public boolean removeCar(Car car) {
        return carRepository.remove(car);
    }

    @Override
    public Car findCarByPlate(String plate) {
        for (Car car : carRepository.findAllCars()) {
            if (car.getLicensePlate().equals(plate)) {
                return car;
            }
        }
        return null;
    }



}
