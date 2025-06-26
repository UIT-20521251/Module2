package ss8_CleanCode.service;

import ss8_CleanCode.entity.Truck;
import ss8_CleanCode.repository.TruckRepository;

import java.util.List;

public class TruckService implements TruckServiceInterface {
    TruckRepository truckRepository = new TruckRepository();

    @Override
    public void addTruck(Truck truck) {
        truckRepository.add(truck);
        System.out.println(truckRepository.findAllTrucks().size());
    }

    @Override
    public List<Truck> showAllTrucks() {
        return truckRepository.findAllTrucks();
    }

    @Override
    public boolean removeTruck(Truck truck) {
        return truckRepository.remove(truck);
    }

    @Override
    public Truck findTruckByPlate(String plate) {
        for (Truck truck : truckRepository.findAllTrucks()) {
            if (truck.getLicensePlate().equals(plate)) {
                return truck;
            }
        }
        return null;
    }
}

