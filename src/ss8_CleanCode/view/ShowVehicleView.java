package ss8_CleanCode.view;

import ss8_CleanCode.controller.ShowVehicleController;
import ss8_CleanCode.entity.Car;
import ss8_CleanCode.entity.Motorbike;
import ss8_CleanCode.entity.Truck;

import java.util.List;
import java.util.Scanner;

public class ShowVehicleView {
    public static int showVehicleMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hiển thị phương tiện: ");
        System.out.println("1. Hiển thị xe tải,");
        System.out.println("2. Hiển thị ôtô, ");
        System.out.println("3. Hiển thị  xe máy.");
        System.out.print("Mời bạn nhập lựa chọn: ");
        return Integer.parseInt(scanner.nextLine());
    }
    public static void showCars(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car.toString());
        }
    }
    public static void showMotorbikes(List<Motorbike> motorbikes) {
        for (Motorbike motorbike: motorbikes) {
            System.out.println(motorbike.toString());
        }
    }
    public static void showTrucks(List<Truck> trucks) {
        for (Truck truck: trucks) {
            System.out.println(truck.toString());
        }
    }
}
