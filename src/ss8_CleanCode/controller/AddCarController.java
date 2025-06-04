package ss8_CleanCode.controller;

import ss8_CleanCode.entity.Car;
import ss8_CleanCode.service.AddVehicleInterface;
import ss8_CleanCode.service.AddVehicleService;

public class AddCarController {
    private AddVehicleInterface addVehicle = new AddVehicleService();

    public void add(Car car){
        addVehicle.addCar(car);
    }
}
