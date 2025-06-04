package ss8_CleanCode.view;

import ss8_CleanCode.service.AddVehicleService;

import java.util.Scanner;

public class AddVehicleView {
    public static int addVehicleMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Thêm mới phương tiện: ");
        System.out.println("1. Thêm xe tải,");
        System.out.println("2. Thêm ôtô, ");
        System.out.println("3. Thêm  xe máy.");
        System.out.print("Mời bạn nhập lựa chọn: ");
        int choice = Integer.parseInt(scanner.nextLine());
        return choice;
    }
    public static void addCarMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Thêm mới ôtô: ");
        System.out.print("Biển kiểm soát (vd: 43A-123.45): ");
        String licensePlate = scanner.nextLine();
        System.out.print("Hãng sản xuất: ");
        String brandName = scanner.nextLine();
        System.out.print("Năm sản xuất: ");
        int productionYear = Integer.parseInt(scanner.nextLine());
        System.out.print("Chủ sở hữu: ");
        String owner = scanner.nextLine();
        System.out.print("Số chổ ngồi: ");
        int numberOfSeats = Integer.parseInt(scanner.nextLine());
        System.out.print("Kiểu xe: ");
        String carType = scanner.nextLine();
        AddVehicleService addVehicleService = new AddVehicleService();
        addVehicleService.addCar(licensePlate,brandName,productionYear,owner,numberOfSeats,carType);
    }
    public static void addMotorbikeMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Thêm mới xe máy: ");
        System.out.print("Biển kiểm soát (vd: 43A-123.45): ");
        String licensePlate = scanner.nextLine();
        System.out.print("Hãng sản xuất: ");
        String brandName = scanner.nextLine();
        System.out.print("Năm sản xuất: ");
        int productionYear = Integer.parseInt(scanner.nextLine());
        System.out.print("Chủ sở hữu: ");
        String owner = scanner.nextLine();
        System.out.print("Công suất: ");
        int horsepower = Integer.parseInt(scanner.nextLine());
        AddVehicleService addVehicleService = new AddVehicleService();
        addVehicleService.addMotorbike(licensePlate,brandName,productionYear,owner,horsepower);
    }
    public static void addTruckMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Thêm mới ôtô: ");
        System.out.print("Biển kiểm soát (vd: 43A-123.45): ");
        String licensePlate = scanner.nextLine();
        System.out.print("Hãng sản xuất: ");
        String brandName = scanner.nextLine();
        System.out.print("Năm sản xuất: ");
        int productionYear = Integer.parseInt(scanner.nextLine());
        System.out.print("Chủ sở hữu: ");
        String owner = scanner.nextLine();
        System.out.print("Tải trọng: ");
        int loadCapacity = Integer.parseInt(scanner.nextLine());
        AddVehicleService addVehicleService = new AddVehicleService();
        addVehicleService.addTruck(licensePlate,brandName,productionYear,owner,loadCapacity);
    }
}
