package ss8_CleanCode.controller;


import ss8_CleanCode.entity.Car;
import ss8_CleanCode.entity.Motorbike;
import ss8_CleanCode.entity.Truck;

import ss8_CleanCode.service.AddVehicleInterface;
import ss8_CleanCode.service.AddVehicleService;
import ss8_CleanCode.view.AddVehicleView;

public class AddVehicleController {
    public void addVehicleController(int choiceAddVehicle) {
        switch (choiceAddVehicle){
            case 1:
                AddVehicleView.addCarMenu();
                break;
            case 2:
                AddVehicleView.addTruckMenu();
                break;
            case 3:
                AddVehicleView.addMotorbikeMenu();
                break;
            default:
                break;
        }
    }
}
