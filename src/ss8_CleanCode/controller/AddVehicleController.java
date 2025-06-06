package ss8_CleanCode.controller;


import ss8_CleanCode.entity.Car;
import ss8_CleanCode.entity.Motorbike;
import ss8_CleanCode.entity.Truck;
import ss8_CleanCode.entity.Brand;

import ss8_CleanCode.controller.BrandController;
import ss8_CleanCode.view.AddVehicleView;

import java.util.List;

public class AddVehicleController {
    private BrandController brandController = new BrandController();
    public void addVehicle( TruckController truckController,CarController carController, MotorbikeController motorbikeController) {
        int choiceAddVehicle = AddVehicleView.addVehicleMenu();
        List<Brand> brandList = brandController.showAllBrands();
        switch (choiceAddVehicle){
            case 1:
                Truck truck = AddVehicleView.addTruckMenu(brandList);
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
