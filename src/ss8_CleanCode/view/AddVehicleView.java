package ss8_CleanCode.view;

import ss8_CleanCode.controller.BrandController;
import ss8_CleanCode.controller.VehicleController.CarController;
import ss8_CleanCode.controller.VehicleController.MotorbikeController;
import ss8_CleanCode.controller.VehicleController.TruckController;
import ss8_CleanCode.entity.Brand;
import ss8_CleanCode.entity.Car;
import ss8_CleanCode.entity.Motorbike;
import ss8_CleanCode.entity.Truck;

import java.util.List;
import java.util.Scanner;

public class AddVehicleView {
    private static BrandController brandController = new BrandController();
    private static CarController carController = new CarController();
    private static MotorbikeController motorbikeController = new MotorbikeController();
    private static TruckController truckController = new TruckController();
    public static void addVehicleMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Thêm mới phương tiện: ");
        System.out.println("1. Thêm xe tải,");
        System.out.println("2. Thêm ôtô, ");
        System.out.println("3. Thêm  xe máy.");
        System.out.print("Mời bạn nhập lựa chọn: ");
        int choice =  Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                truckController.add(addTruckInput());
                break;
            case 2:
                carController.add(addCarInput());
                break;
            case 3:
                motorbikeController.add(addMotorbikeInput());
                break;

        }
    }
    public static Car addCarInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Thêm mới ôtô: ");
        System.out.print("Biển kiểm soát (vd: 43A-123.45): ");
        String licensePlate = scanner.nextLine();
        String brandCode = inputBrand();
        Brand brand = brandController.findBrandByCode(brandCode);
        System.out.print("Năm sản xuất: ");
        int productionYear = Integer.parseInt(scanner.nextLine().trim());
        System.out.print("Chủ sở hữu: ");
        String owner = scanner.nextLine();
        System.out.print("Số chổ ngồi: ");
        int numberOfSeats = Integer.parseInt(scanner.nextLine().trim());
        System.out.print("Kiểu xe: ");
        String carType = scanner.nextLine();
        return new Car(licensePlate, brand, productionYear, owner,numberOfSeats, carType);
    }
    public static Motorbike addMotorbikeInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Thêm mới xe máy: ");
        System.out.print("Biển kiểm soát (vd: 43A-123.45): ");
        String licensePlate = scanner.nextLine();
        String brandCode = inputBrand();
        Brand brand = brandController.findBrandByCode(brandCode);
        System.out.print("Năm sản xuất: ");
        int productionYear = Integer.parseInt(scanner.nextLine().trim());
        System.out.print("Chủ sở hữu: ");
        String owner = scanner.nextLine();
        System.out.print("Công suất: ");
        int horsepower = Integer.parseInt(scanner.nextLine().trim());
        return new Motorbike(licensePlate, brand, productionYear, owner,horsepower);
    }
    public static Truck addTruckInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Thêm mới ôtô: ");
        System.out.print("Biển kiểm soát (vd: 43A-123.45): ");
        String licensePlate = scanner.nextLine();
        String brandCode = inputBrand();
        Brand brand = brandController.findBrandByCode(brandCode);
        System.out.print("Năm sản xuất: ");
        int productionYear = Integer.parseInt(scanner.nextLine().trim());
        System.out.print("Chủ sở hữu: ");
        String owner = scanner.nextLine();
        System.out.print("Tải trọng: ");
        int loadCapacity = Integer.parseInt(scanner.nextLine().trim());
        return new Truck(licensePlate, brand, productionYear, owner, loadCapacity);
    }

    public static String inputBrand() {
        List<Brand> brands =brandController.showAllBrands();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãng sản xuất: ");
        for (Brand brand : brands) {
            System.out.println(brand.toString());
        }
        System.out.print("Hãng xe của bạn (Nhập mã hãng sản xuất): ");
        return scanner.nextLine();
    }
}
