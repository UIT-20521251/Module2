package ss8_CleanCode.controller.VehicleController;


import ss8_CleanCode.entity.Truck;
import ss8_CleanCode.service.TruckServiceInterface;
import ss8_CleanCode.service.TruckService;

import java.util.List;

public class TruckController {
    private TruckServiceInterface truckService = new TruckService();

    public void add(Truck truck){
        truckService.addTruck(truck);
    }
    public List<Truck> showAllTrucks(){
        return truckService.showAllTrucks();
    }
    public boolean remove(String plate){
        return truckService.removeTruck(findTruckByPlate(plate));
    }
    public Truck findTruckByPlate(String plate){
        return truckService.findTruckByPlate(plate);
    }
}
