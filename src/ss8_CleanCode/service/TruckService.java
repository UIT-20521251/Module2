package ss8_CleanCode.service;

import ss8_CleanCode.entity.Car;
import ss8_CleanCode.entity.Motorbike;
import ss8_CleanCode.entity.Truck;
import ss8_CleanCode.repository.CarRepository;
import ss8_CleanCode.repository.MotorbikeRepository;
import ss8_CleanCode.repository.TruckRepository;

import java.util.List;

public class TruckService implements TruckInterface {
    TruckRepository truckRepository = new TruckRepository();

    @Override
    public void addTruck(Truck truck) {
        truckRepository.add(truck);
        System.out.println(truckRepository.getTrucks().size());
    }

    @Override
    public List<Truck> showAllTrucks() {
        return truckRepository.getTrucks();
    }

    @Override
    public void removeTruck(Truck truck) {
        truckRepository.remove(truck);
    }

    @Override
    public Truck findTruckByPlate(String plate) {
        for (Truck truck : truckRepository.getTrucks()) {
            if (truck.getLicensePlate().equals(plate)) {
                return truck;
            }
        }
        return null;
    }
}

