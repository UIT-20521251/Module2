package ss8_CleanCode.service;

import ss8_CleanCode.entity.Car;
import ss8_CleanCode.entity.Motorbike;
import ss8_CleanCode.entity.Truck;
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
    public void removeMotorbike(Motorbike motorbike) {
        motorbikeRepository.remove(motorbike);
    }

    @Override
    public Motorbike findMotorbikeByPlate(String plate) {
        for (Motorbike motorbike : motorbikeRepository.getMotorbikes()) {
            if (motorbike.getLicensePlate().equals(plate)) {
                return motorbike;
            }
        }
        return null;
    }

}
