package ss8_CleanCode.controller;


import ss8_CleanCode.entity.Truck;
import ss8_CleanCode.service.AddVehicleInterface;
import ss8_CleanCode.service.AddVehicleService;

public class AddTruckController {
    private AddVehicleInterface addVehicle = new AddVehicleService();

    public void add(Truck truck){
        addVehicle.addTruck(truck);
    }
}
