package ss8_CleanCode.controller;

import ss8_CleanCode.view.AddVehicleView;
import ss8_CleanCode.view.MainView;

public class MainController {
    public static void main(String[] args) {
        int choice = MainView.displayMainView();
        switch (choice) {
            case 1:
                AddVehicleView.addVehicleMenu();
                break;
        }
    }
}
