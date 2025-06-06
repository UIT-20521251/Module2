package ss8_CleanCode.service;


import ss8_CleanCode.entity.Truck;
import java.util.List;


public interface TruckInterface {

    void addTruck(Truck truck);
    List<Truck> showAllTrucks();
    void removeTruck(Truck truck);
    Truck findTruckByPlate(String licensePlate);
}
