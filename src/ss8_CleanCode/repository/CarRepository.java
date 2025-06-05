package ss8_CleanCode.repository;

import ss8_CleanCode.entity.Car;

import java.util.ArrayList;
import java.util.List;

public class CarRepository {
    private List<Car> cars = new ArrayList<>();

    public void add(Car car) {
        cars.add(car);
    }
    public void remove(Car car) {}
    public List<Car> getCars() {
        return cars;
    }
}
