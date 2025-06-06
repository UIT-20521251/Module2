package ss8_CleanCode.view;

import java.util.Scanner;

public class RemoveVehicleView {
    public static String removeVehicleMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập biển kiểm soát xe: ");
        return scanner.nextLine();
    }
}
