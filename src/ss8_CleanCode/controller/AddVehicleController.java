package ss8_CleanCode.controller;

import ss8_CleanCode.view.AddVehicleView;


public class AddVehicleController {
    public static void main() {
        int choice = AddVehicleView.addVehicleMenu();
        switch (choice) {
            case 1:
                AddVehicleView.addTruckMenu();
                break;
            case 2:
                AddVehicleView.addCarMenu();
                break;
            case 3:
                AddVehicleView.addMotorbikeMenu();
                break;
            default:
                break;
        }
    }
}
