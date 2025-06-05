package ss8_CleanCode.controller;


import ss8_CleanCode.entity.Car;
import ss8_CleanCode.entity.Motorbike;
import ss8_CleanCode.entity.Truck;

import ss8_CleanCode.view.AddVehicleView;

public class AddVehicleController {
    public void addVehicle( TruckController truckController,CarController carController, MotorbikeController motorbikeController) {
        int choiceAddVehicle = AddVehicleView.addVehicleMenu();
        switch (choiceAddVehicle){
            case 1:
                Truck truck = AddVehicleView.addTruckMenu();
                truckController.add(truck);
                break;
            case 2:
                Car car= AddVehicleView.addCarMenu();
                carController.add(car);
                break;
            case 3:
                Motorbike motorbike=AddVehicleView.addMotorbikeMenu();
                motorbikeController.add(motorbike);
                break;
            default:
                break;
        }
    }
}
