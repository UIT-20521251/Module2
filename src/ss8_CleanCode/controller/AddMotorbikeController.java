package ss8_CleanCode.controller;


import ss8_CleanCode.entity.Motorbike;
import ss8_CleanCode.service.AddVehicleInterface;
import ss8_CleanCode.service.AddVehicleService;

public class AddMotorbikeController {
    private AddVehicleInterface addVehicle = new AddVehicleService();

    public void add(Motorbike motorbike){
        addVehicle.addMotorbike(motorbike);
    }
}
