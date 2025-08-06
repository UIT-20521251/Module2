package module2.ss8_CleanCode.repository;

import module2.ss8_CleanCode.entity.Car;

import java.util.List;

public interface CarRepoInterface {
    void add(Car car);
    boolean remove(Car car);
    List<Car> findAllCars();
}
