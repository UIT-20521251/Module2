package ss8_CleanCode.controller.VehicleController;


import ss8_CleanCode.entity.Truck;
import ss8_CleanCode.service.TruckInterface;
import ss8_CleanCode.service.TruckService;

import java.util.List;

public class TruckController {
    private TruckInterface truckService = new TruckService();

    public void add(Truck truck){
        truckService.addTruck(truck);
    }
    public List<Truck> showAllTrucks(){
        return truckService.showAllTrucks();
    }
    public void remove(String plate){
        truckService.removeTruck(truckService.findTruckByPlate(plate));
    }

}
