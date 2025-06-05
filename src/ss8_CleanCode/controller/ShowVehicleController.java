package ss8_CleanCode.controller;

import ss8_CleanCode.entity.Car;
import ss8_CleanCode.entity.Motorbike;
import ss8_CleanCode.entity.Truck;
import ss8_CleanCode.view.ShowVehicleView;

import java.util.List;

public class ShowVehicleController {

    public void showVehicleController(TruckController truckController,CarController carController, MotorbikeController motorbikeController) {
        int choiceShowVehicle = ShowVehicleView.showVehicleMenu();
        switch (choiceShowVehicle) {
            case 1:
                List<Truck> trucks = truckController.showAllTrucks();
                System.out.println(trucks.size());
                ShowVehicleView.showTrucks(trucks);
                break;
            case 2:
                List<Car> cars = carController.showAllCars();
                ShowVehicleView.showCars(cars);
                break;
            case 3:
                List<Motorbike> motorbikes = motorbikeController.showAllMotorbikes();
                ShowVehicleView.showMotorbikes(motorbikes);
                break;
            default:
                break;
        }
    }
}
