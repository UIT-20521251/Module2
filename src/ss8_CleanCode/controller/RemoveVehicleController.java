package ss8_CleanCode.controller;

import ss8_CleanCode.controller.VehicleController.CarController;
import ss8_CleanCode.controller.VehicleController.MotorbikeController;
import ss8_CleanCode.controller.VehicleController.TruckController;
import ss8_CleanCode.view.RemoveVehicleView;

public class RemoveVehicleController {
    public void removeVehicleController(TruckController truckController, CarController carController, MotorbikeController motorbikeController){
        String  licensePlate = RemoveVehicleView.removeVehicleMenu();
        truckController.remove(licensePlate);
    }
}

