package ss8_CleanCode.view;

import java.util.Scanner;

public class ShowVehicleView {
    public static int showVehicleMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hiển thị phương tiện: ");
        System.out.println("1. Hiển thị xe tải,");
        System.out.println("2. Hiển thị ôtô, ");
        System.out.println("3. Hiển thị  xe máy.");
        System.out.print("Mời bạn nhập lựa chọn: ");
        int choice = Integer.parseInt(scanner.nextLine());
        return choice;
    }
}
