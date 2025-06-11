package ss8_CleanCode.controller;


import ss8_CleanCode.controller.VehicleController.CarController;
import ss8_CleanCode.controller.VehicleController.MotorbikeController;
import ss8_CleanCode.controller.VehicleController.TruckController;
import ss8_CleanCode.view.MainView;

public class MainController {
    private static AddVehicleController addVehicleController = new AddVehicleController();
    private static ShowVehicleController showVehicleController = new ShowVehicleController();
    private static RemoveVehicleController removeVehicleController = new RemoveVehicleController();
    private static CarController carController = new CarController();
    private static MotorbikeController motorbikeController = new MotorbikeController();
    private static TruckController truckController = new TruckController();
    public static void main(String[] args) {
        displayMainMenu();
    }
    public static void displayMainMenu() {
        boolean isPause = true;
        while (isPause) {
            int choice = MainView.displayMainView();
            switch (choice) {
                case 1:
                    addVehicleController.addVehicle(truckController,carController,motorbikeController);
                    break;
                case 2:
                    showVehicleController.showVehicleController(truckController,carController,motorbikeController);
                    break;
                case 3:
                    removeVehicleController.removeVehicleController(truckController,carController,motorbikeController);
                    break;
                case 4:
                    isPause = false;
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + choice);
            }
        }

    }
}
