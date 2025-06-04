package ss8_CleanCode.repository;

import ss8_CleanCode.entity.Car;
import ss8_CleanCode.entity.Truck;

import java.util.ArrayList;
import java.util.List;

public class TruckRepository {
    private List<Truck> trucks = new ArrayList<>();

    public void add(Truck truck) {
        trucks.add(truck);
    }

}
