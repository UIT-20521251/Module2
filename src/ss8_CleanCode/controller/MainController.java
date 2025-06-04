package ss8_CleanCode.controller;

import ss8_CleanCode.view.AddVehicleView;
import ss8_CleanCode.view.ShowVehicleView;
import ss8_CleanCode.view.MainView;

public class MainController {
    public static void main(String[] args) {
        int choice = MainView.displayMainView();
        switch (choice) {
            case 1:
                AddVehicleView.addVehicleMenu();
                break;
            case 2:
                ShowVehicleView.showVehicleMenu();
                break;
            case 3:
                ShowVehicleView.showVehicleMenu();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + choice);
        }
    }
}
