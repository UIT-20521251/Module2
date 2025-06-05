package ss8_CleanCode.service;

import ss8_CleanCode.entity.Car;
import ss8_CleanCode.entity.Motorbike;
import ss8_CleanCode.repository.CarRepository;
import ss8_CleanCode.repository.MotorbikeRepository;

import java.util.List;

public class MotorbikeService implements MotorbikeInterface {
    private MotorbikeRepository motorbikeRepository = new MotorbikeRepository();
    @Override
    public void addMotorbike(Motorbike car) {
        motorbikeRepository.add(car);
    }
    @Override
    public List<Motorbike> showAllMotorbikes() {
        return motorbikeRepository.getMotorbikes();
    }

}
